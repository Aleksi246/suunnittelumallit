package t11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

public class Gui extends Application {

    // create a GUI with three adjacent ColorBoxes and one CheckBox below them
    private Controller controller;
    private ColorBox colorBox1;
    private ColorBox colorBox2;
    private ColorBox colorBox3;
    private CheckBox checkBox;
    private ListView<IMemento> listview;

    public void start(Stage stage) {

        controller = new Controller(this);

        // Insets for margin and padding
        Insets insets = new Insets(10, 10, 10, 10);

        // Create three ColorBoxes
        colorBox1 = new ColorBox(1, controller);
        colorBox2 = new ColorBox(2, controller);
        colorBox3 = new ColorBox(3, controller);

        // Create a CheckBox
        checkBox = new CheckBox("Click me!");
        checkBox.setPadding(insets);

        // Add the ColorBoxes and CheckBox to a HBox
        HBox hBox = new HBox(colorBox1.getRectangle(), colorBox2.getRectangle(), colorBox3.getRectangle());
        hBox.setSpacing(10);

        hBox.setMargin(colorBox1.getRectangle(), insets);
        hBox.setMargin(colorBox2.getRectangle(), insets);
        hBox.setMargin(colorBox3.getRectangle(), insets);


        Label label = new Label("Press Ctrl-Z to undo the last change.");
        label.setPadding(insets);

        listview = new ListView<>();

        listview.setOnMouseClicked(event -> {
            int index = listview.getSelectionModel().getSelectedIndex();

            int historySize = controller.getHistory().size();

            int diff = 0;

            if(index < historySize){
                diff = historySize - index ;
                for (int i = 0; i < diff; i++) {
                    controller.undo();
                }
            }else{
                diff = (index +1) - historySize;
                for (int i = 0; i < diff; i++) {
                    controller.redo();
                }
            }
            
        });

        // create a VBox that contains the HBox and the CheckBox
        VBox vBox = new VBox(hBox, checkBox, label, listview);
        // call controller when the CheckBox is clicked
        checkBox.setOnAction(event -> {
            controller.setIsSelected(checkBox.isSelected());
        });

        // Set the vBox to be the root of the Scene
        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                // Ctrl-Z: undo
                System.out.println("Undo key combination pressed");
                controller.undo();
            }
            if (event.isControlDown() && event.getCode() == KeyCode.Y) {
                // Ctrl-Y: redo
                System.out.println("Redo key combination pressed");
                controller.redo();
            }
        });
        


        stage.setScene(scene);
        stage.setTitle("Memento Pattern Example");
        stage.show();

        // Sync initial visual state and list content with controller/model state.
        updateGui();
    }

    public void updateGui() {
        // called after restoring state from a Memento
        colorBox1.setColor(controller.getOption(1));
        colorBox2.setColor(controller.getOption(2));
        colorBox3.setColor(controller.getOption(3));
        checkBox.setSelected(controller.getIsSelected());

        listview.getItems().clear();
        listview.getItems().addAll(controller.getHistory());
        //add current state here

        // Show future in reverse order so the next redo candidate appears first in the UI.
        for (int i = controller.getFuture().size() - 1; i >= 0; i--) {
            listview.getItems().add(controller.getFuture().get(i));
        }
    }
}