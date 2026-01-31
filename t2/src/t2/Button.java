package t2;

public abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    abstract void display();
}
