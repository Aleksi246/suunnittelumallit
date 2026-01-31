package t2;

public class Main {
    public static void main(String[] args){
        UIFactory uiFactory = new BFactory();
        Button button1 = uiFactory.createButton("button1 text");
        CheckBox checkbox1 =uiFactory.createCheckBox("checkbox1 text");

        button1.display();
        checkbox1.display();

        button1.setText("button new text");
        checkbox1.setText("checkbox new text");

        button1.display();
        checkbox1.display();
    }
} 
