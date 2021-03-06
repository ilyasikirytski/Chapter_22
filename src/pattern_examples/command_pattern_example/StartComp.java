package pattern_examples.command_pattern_example;
//concrete command
public class StartComp implements Command {
    Comp computer;

    public StartComp(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
