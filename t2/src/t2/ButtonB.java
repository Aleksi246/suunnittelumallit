package t2;

public class ButtonB extends Button{
    public ButtonB(String text){
        super(text);
    }
    @Override
    public void display(){
        System.out.println("button B text: " + text);
    }
}

