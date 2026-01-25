public class TextFieldA implements TextField{
    protected String text;

    public TextFieldA(String text){
        this.text = text;
    }
    @Override
    public void display(){
        System.out.println("textfield A text: " + text);
    }
    @Override
    public void setText(String text){
        this.text = text;
    }
}
