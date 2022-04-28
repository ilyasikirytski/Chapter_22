package chain_of_responsibility_example;

abstract class Logger {
    int priority;
    Logger nextLogger;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.writeMessage(message, level);
        }
    }

    abstract void write(String message);
}
