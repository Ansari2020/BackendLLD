package DesignPatterns.Decorators.LoggerDecorator;

public class Client {
    public static void main(String[] args) {
        BasicLogger logger = new BasicLogger();
        logger.log("Hello World");

        Logger logger1=new BasicLogger();
        logger1=new InfoLogDecorator(logger1);

        logger1.log("Hello World");

        logger1=new TimestampDecorator(logger1);
        logger1.log("new timestamp");


    }
}
