package homework5.task1;

public class DbLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
