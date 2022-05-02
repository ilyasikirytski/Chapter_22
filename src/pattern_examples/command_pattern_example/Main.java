package pattern_examples.command_pattern_example;

public class Main {
    public static void main(String[] args) {
        Comp computer = new Comp();
        User user = new User(new StartComp(computer), new StopComp(computer), new ResetComp(computer));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
