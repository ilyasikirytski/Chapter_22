package chain_of_responsibility_example;

public class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS: " + message);
    }
}
