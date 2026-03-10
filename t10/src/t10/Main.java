package t10;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Message("i want my money back","asd@hotmail.com",MessageType.COMPENSATION_CLAIM);
        Message m2 = new Message("can you be my friend","mymail@hotmail.com",MessageType.CONTACT_REQUEST);
        Message m3 = new Message("meh","mehmail@hotmail.com",MessageType.GENERAL_FEEDBACK);
        Message m4 = new Message("your paswords are not hashed you can pay me in bitcoin","hacker@hotmail.com",MessageType.DEVELOPMENT_SUGGESTION);
        

        Handler thehandler;

        Handler devhandler = new DevHandler();
        Handler genhandler = new GenHandler();
        Handler conthandler = new ContHandler();
        Handler comphandler = new CompHandler();

        devhandler.setNextHandler(genhandler);
        genhandler.setNextHandler(conthandler);
        conthandler.setNextHandler(comphandler);
        thehandler = devhandler;

        thehandler.process(m1);
        thehandler.process(m2);
        thehandler.process(m3);
        thehandler.process(m4);
    }
}
