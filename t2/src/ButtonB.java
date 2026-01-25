public class ButtonB implements Button{
    protected String text;

    public ButtonB(String text){
        this.text = text;
    }
    @Override
    public void display(){
        System.out.println("button B text: " + text);
    }
    @Override
    public void setText(String text){
        this.text = text;
    }
}
