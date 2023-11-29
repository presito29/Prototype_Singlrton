package singleton;

public abstract class IProgram {

    protected Logger logger;

    protected IProgram() {
        logger = Logger.getInstance();
    }

    public abstract void log(String message);
}
