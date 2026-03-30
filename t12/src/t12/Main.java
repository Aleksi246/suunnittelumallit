package t12;

public class Main {
    public static void main(String[] args) {
        //users
        User Aku = new User("Aku");
        User Roope = new User("Roope");

        //real documents
        Document doc1 = new Document("not secret text");
        Document doc2 = new Document("secret text");

        //proxies for protected documents
        DocumentProxy docproxy = new DocumentProxy(doc2);

        //constructing library
        Library library = Library.getInstance();
        library.addDocument(doc1);
        library.addDocument(docproxy);

        //access rights
        AccessControlService accescontrolservice = AccessControlService.getInstance();
        accescontrolservice.grantAccess(1,"Aku");

        //testing. i imagine that the client is only given access to library

        System.out.println(doc1.getId());
        System.out.println(doc2.getId());

        System.out.println(doc1.getDate());
        System.out.println(doc2.getDate());
        
        //user accesses normal document
        System.out.println(library.getDocument(0).getContent(Roope));
        //unauthorized user tries to access a protected document
        System.out.println(library.getDocument(1).getContent(Roope));
        //authorized user accesses a protected document
        System.out.println(library.getDocument(1).getContent(Aku));
        


    }

    
}
