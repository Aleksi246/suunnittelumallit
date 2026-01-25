public class CheckBoxB implements CheckBox{
    protected String text;

    public CheckBoxB(String text){
        this.text = text;
    }
    @Override
    public void display(){
        System.out.println("checkbox B text: " + text);
    }
    @Override
    public void setText(String text){
        this.text = text;
    }
}

