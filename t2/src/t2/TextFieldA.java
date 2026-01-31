package t2;

public class TextFieldA extends TextField{
    public TextFieldA(String text){
        super(text);
    }
    @Override
    public void display(){
        System.out.println("textfield A text: " + text);
    }
}