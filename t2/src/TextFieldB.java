public class TextFieldB implements TextField{
    protected String text;

    public TextFieldB(String text){
        this.text = text;
    }
    @Override
    public void display(){
        System.out.println("textfield B text: " + text);
    }
    @Override
    public void setText(String text){
        this.text = text;
    }
}
