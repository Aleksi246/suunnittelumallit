package t4;

public class WeatherStation extends Subject implements Runnable{

    private int temp;
    private Thread thread;

    public WeatherStation(){
        this.temp = (int) (Math.random()*100);
        this.thread = new Thread(this);
        this.thread.start();

    }

    public int getState(){
        return temp;
    }

    @Override
    public void run() {
        while(true){
            try{
            this.temp = this.temp + ((-2*((int)(Math.random()*2)))+1);
            notifyObservers();
            Thread.sleep(3000);

            } catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
    
    
}
