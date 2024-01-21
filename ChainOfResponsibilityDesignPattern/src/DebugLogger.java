public class DebugLogger extends LoggerProcessor {
    public DebugLogger(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        }
        super.log(logLevel, message);
    }
}
