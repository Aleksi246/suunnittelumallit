package t12;

import java.util.Date;

public class Document implements DocumentInterface{

    private static int counter = 0;

    private int id;
    private Date date;

    private String content;

    public Document(String content){
        
        this.content = content;
        this.id = counter;
        this.date = new Date();

        counter += 1;
    }

    public Date getDate(){
        return date;
    }

    public int getId(){
        return id;
    }

    public String getContent(User user){
        return content;
    }


}
