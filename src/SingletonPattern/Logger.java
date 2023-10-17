package SingletonPattern;

public class Logger {

    private static Logger logger;

    private Logger(){
        System.out.println("creating logger");
    }

    public static Logger getLogger(){

        // double-checked locking
        if(logger==null) {
            synchronized (Logger.class) { // late binding-> synchronized used for multithreading scenarios
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

}
