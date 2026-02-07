package t4;

public class Main {
    public static void main(String[] args) {
        WeatherStation wt = new WeatherStation();
        Observer A = new ConcreteObserverA(wt);
        Observer B = new ConcreteObserverB(wt);
        Observer B2 = new ConcreteObserverB(wt);
        ConcreteObserverC C = new ConcreteObserverC(wt);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }
        
        wt.removeObserver(B);
        C.StopObserving();
    }
}
