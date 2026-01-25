public class Main {
    public static void main(String[] args){
        UIFactory uiFactory = new BFactory();
        Button button1 = uiFactory.createButton("button a text");
        button1.display();
        button1.setText("new text");
        button1.display();
    }
} 
