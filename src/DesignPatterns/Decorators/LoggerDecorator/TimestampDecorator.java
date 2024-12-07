package DesignPatterns.Decorators.LoggerDecorator;

public class TimestampDecorator extends LoggerDecorator {
    private Logger logger;

    public TimestampDecorator(Logger logger) {
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        logger.log("[ "+java.time.LocalDateTime.now()+" ] "+ message);
    }
}
