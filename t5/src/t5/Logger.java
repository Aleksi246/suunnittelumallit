package t5;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance = new Logger();
    private FileWriter writer;

    private Logger() {
        setFileName("default.txt");
    }

    public static Logger getInstance(){
        return instance;
    }

    public void setFileName(String name){
        try {
            if(this.writer != null){
                this.writer.close();
            }
            this.writer = new FileWriter(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String log){
        try {
            this.writer.write(log + "\n");
            this.writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void close(){
        try {
            if(this.writer != null){
                this.writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
