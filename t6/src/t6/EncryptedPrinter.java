package t6;

public class EncryptedPrinter extends Decorator{

    public EncryptedPrinter(Printer printer){
        super(printer);
    }

    @Override
    public void print(String text){
        String modified = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            modified += (char)(c+1);
        }

        super.print(modified);
    }
    
}
