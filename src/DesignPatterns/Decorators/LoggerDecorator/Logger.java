package DesignPatterns.Decorators.LoggerDecorator;

public abstract class Logger {

    public void log(String message) {
        System.out.println(message);
    }
}
