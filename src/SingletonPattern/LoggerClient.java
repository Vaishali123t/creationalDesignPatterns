package SingletonPattern;

public class LoggerClient {

   public static void main(String args[]){

       Logger logger= Logger.getLogger(); // creating logger will be printed
       Logger logger1= Logger.getLogger(); // creating logger won't be printed since logger has already been created
   }


}
