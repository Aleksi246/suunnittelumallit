package t10;

public class Message {
    private String message;
    private String senderEmail;
    private MessageType type;

    public Message(String msg, String eml, MessageType tp){
        this.message = msg;
        this.senderEmail = eml;
        this.type = tp;
    }

    public String getMessage() {
        return message;
    }


    public String getSenderEmail() {
        return senderEmail;
    }


    public MessageType getType() {
        return type;
    }
}