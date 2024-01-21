public class ErrorLogger extends LoggerProcessor{
    public ErrorLogger(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        }
        super.log(logLevel, message);
    }
}
