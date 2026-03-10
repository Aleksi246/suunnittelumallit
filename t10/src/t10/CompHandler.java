package t10;

public class CompHandler extends Handler{
    @Override
    public void process(Message message){
        if(message.getType()==MessageType.COMPENSATION_CLAIM){
            System.out.println("message: " + message.getMessage() + " sent to insurance team");
        }else{
            super.process(message);
        }
    } 
}
