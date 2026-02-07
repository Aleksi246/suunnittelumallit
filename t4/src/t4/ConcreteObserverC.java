package t4;

public class ConcreteObserverC implements Observer{

    private WeatherStation subject;

    public ConcreteObserverC(WeatherStation subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    public void StopObserving(){
        this.subject.removeObserver(this);
    }

    @Override
    public void update(){
        System.out.println("concrete observer c updated: " + subject.getState());
    }
    
}
