
public class Main {
    public static void main(String[] args) {
        LoggerProcessor logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(2, "Debugger");
        logger.log(3, "Error");
        logger.log(1, "Info");
        logger.log(4, "None");
    }
}