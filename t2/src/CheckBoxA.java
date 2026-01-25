public class CheckBoxA implements CheckBox{
    protected String text;

    public CheckBoxA(String text){
        this.text = text;
    }
    @Override
    public void display(){
        System.out.println("checkbox A text: " + text);
    }
    @Override
    public void setText(String text){
        this.text = text;
    }
}
