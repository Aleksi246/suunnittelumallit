package t19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX works!");
        Scene scene = new Scene(label, 300, 200);
        stage.setTitle("t19 Test");
        stage.setScene(scene);

        Stage newstage = new Stage();
        Label label2 = new Label("testing");
        Scene scene2 = new Scene(label2, 300, 200);
        newstage.setTitle("t19 Test2");
        newstage.setScene(scene2);
        stage.show();
        newstage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
