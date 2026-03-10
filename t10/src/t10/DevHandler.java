package t10;

public class DevHandler extends Handler{
    @Override
    public void process(Message message){
        if(message.getType()==MessageType.DEVELOPMENT_SUGGESTION){
            System.out.println("message: " + message.getMessage() + " sent to dev team");
        }else{
            super.process(message);
        }
    }
}
