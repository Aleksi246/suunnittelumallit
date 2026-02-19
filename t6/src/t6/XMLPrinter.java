package t6;

public class XMLPrinter extends Decorator{

    public XMLPrinter(Printer printer){
        super(printer);
    }

    @Override
    public void print(String text){
        String modified = "<msg>"+text+"</msg>";
        
        super.print(modified);
    }
    
}
