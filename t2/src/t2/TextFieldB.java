package t2;

public class TextFieldB extends TextField{
    public TextFieldB(String text){
        super(text);
    }
    @Override
    public void display(){
        System.out.println("textfield B text: " + text);
    }
}
