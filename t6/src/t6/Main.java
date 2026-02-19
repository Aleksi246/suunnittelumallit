package t6;

public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello World!");

        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("Hello World!");
        
        Printer printer3 = new XMLPrinter(new EncryptedPrinter(new XMLPrinter(new BasicPrinter())));
        printer3.print("Hello World!");
    }
}
