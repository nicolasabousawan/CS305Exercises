package ch.epfl.sweng.dp1.solutions.ex7;

public class Logger {
    private static final Logger instance = new Logger();

    private Logger() {
        if (instance != null)
            throw new IllegalStateException("Already instantiated");
    }

    public static Logger getInstance() {
        return instance;
    }

    protected void print() {
        System.out.println("Logged");
    }
}
