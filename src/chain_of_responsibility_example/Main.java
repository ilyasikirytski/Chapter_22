package chain_of_responsibility_example;

public class Main {
    public static void main(String[] args) {
        Logger logger0 = new SMSLogger(Level.ERROR);
        Logger logger1 = new FileLogger(Level.DEBUG);
        Logger logger2 = new EmailLogger(Level.INFO);
        logger0.setNextLogger(logger1);
        logger1.setNextLogger(logger2);

        logger0.writeMessage("everything is good", Level.INFO);
        logger0.writeMessage("debug process", Level.DEBUG);
        logger0.writeMessage("system crash", Level.ERROR);
    }
}
