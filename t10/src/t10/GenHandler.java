package t10;

public class GenHandler extends Handler{
    @Override
    public void process(Message message){
        if(message.getType()==MessageType.GENERAL_FEEDBACK){
            System.out.println("message: " + message.getMessage() + " sent to general feedback enjoyers");
        }else{
            super.process(message);
        }
    } 
}
