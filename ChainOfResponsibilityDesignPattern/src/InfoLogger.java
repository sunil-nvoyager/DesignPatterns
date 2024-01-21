public class InfoLogger extends  LoggerProcessor{
    public InfoLogger(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == LOG) {
            System.out.println("INFO: " + message);
        }
        super.log(logLevel, message);
    }
}
