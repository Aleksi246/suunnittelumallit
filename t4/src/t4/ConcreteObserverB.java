package t4;

public class ConcreteObserverB implements Observer{

    private WeatherStation subject;

    public ConcreteObserverB(WeatherStation subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(){
        System.out.println("concrete observer b updated: " + subject.getState());
    }
    
}
