package t10;

public class ContHandler extends Handler{
    @Override
    public void process(Message message){
        if(message.getType()==MessageType.CONTACT_REQUEST){
            System.out.println("message: " + message.getMessage() + " sent to front desk");
        }else{
            super.process(message);
        }
    } 
    
}
