package t12;

import java.util.Date;

public class DocumentProxy implements DocumentInterface{

    private Document document;

    public DocumentProxy(Document doc){
        this.document = doc;
    }

    public int getId(){
        return document.getId();
    }
    public Date getDate(){
        return document.getDate();
    }

    public String getContent(User user){
        AccessControlService accescontrolservice = AccessControlService.getInstance();
        String name = user.getUsername();

        try {
            if(accescontrolservice.isAllowed(getId(), name)){
            return document.getContent(user);
        }else{
            throw new AccessDeniedException("denied access");
        }
        } catch (Exception e) {
            return "access denied for user " + name;
        }
        
        
    }

}
