package t2;

public abstract class CheckBox {
    protected String text;

    public CheckBox(String text) {
        this.text = text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    abstract void display();
}
