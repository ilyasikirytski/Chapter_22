package chain_of_responsibility_example;

public class EmailLogger extends Logger {

    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Email: " + message);
    }
}
