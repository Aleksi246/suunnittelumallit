package t6;

public abstract class Decorator implements Printer{
    private Printer printer;

    public Decorator(Printer printer){
        this.printer = printer;
    }

    @Override
    public void print(String text){
        printer.print(text);
    };
    
}
