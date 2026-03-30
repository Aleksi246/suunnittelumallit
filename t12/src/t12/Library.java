package t12;
import java.util.*;
public class Library {
    private Map<Integer, DocumentInterface> documents = new HashMap<>();
    private static Library instance;

    private Library(){}

    public static Library getInstance(){
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addDocument(DocumentInterface doc){
        documents.put(doc.getId(), doc);
    }

    public DocumentInterface getDocument(int id){
        return documents.get(id);
    }
}

 