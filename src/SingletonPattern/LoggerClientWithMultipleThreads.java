package SingletonPattern;

public class LoggerClientWithMultipleThreads implements Runnable{

    @Override
    public void run() {
        Logger logger= Logger.getLogger(); // creating logger will be printed
        System.out.println(logger);
        Logger logger1= Logger.getLogger(); // creating logger won't be printed since logger has already been created
        System.out.println(logger1);
    }

   public static void main(String args[]){

        Thread thread1= new Thread(new LoggerClientWithMultipleThreads());
        Thread thread2= new Thread(new LoggerClientWithMultipleThreads());

        thread1.start();
        thread2.start();

   }


}
