package homework5.task1;

public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
