package t5;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.write("logging to default.txt");
        logger.write("brrrrrrrrrrrrrrrrrrr");
        logger.write("destroy world");
        logger.setFileName("new_log.txt"); // Change file name
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close(); // Remember to close the logger
    }
}
