public class ButtonA implements Button{
    protected String text;

    public ButtonA(String text){
        this.text = text;
    }
    @Override
    public void display(){
        System.out.println("button A text: " + text);
    }
    @Override
    public void setText(String text){
        this.text = text;
    }
}
