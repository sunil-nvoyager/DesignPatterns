//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LoggerProcessor logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(2, "Debugger");
        logger.log(3, "Error");
        logger.log(1, "Info");
        logger.log(4, "None");
    }
}