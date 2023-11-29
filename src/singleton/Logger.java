package singleton;

import java.util.Date;

public class Logger {

    private static Logger instance;

    private StringBuilder log;

    private Logger() {
        log = new StringBuilder();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    public void addLog(String message) {
        log.append(new Date()).append(": ").append(message).append("\n");
    }

    public String getLog() {
        return log.toString();
    }
}
