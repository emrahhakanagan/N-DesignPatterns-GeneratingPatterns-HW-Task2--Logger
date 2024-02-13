public class Logger {
    private static Logger instance;
    private int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("[" + new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new java.util.Date()) + " " + num++ + "] " + msg);
    }
}
