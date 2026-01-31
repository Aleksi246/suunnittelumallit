package t2;

public class ButtonA extends Button{
    public ButtonA(String text){
        super(text);
    }
    @Override
    public void display(){
        System.out.println("button A text: " + text);
    }
}
