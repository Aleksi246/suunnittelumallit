package t4;

public class ConcreteObserverA implements Observer{

    private WeatherStation subject;

    public ConcreteObserverA(WeatherStation subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(){
        System.out.println("concrete observer a updated: " + subject.getState());
    }
    
}
