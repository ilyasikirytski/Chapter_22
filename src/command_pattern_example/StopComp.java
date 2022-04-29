package command_pattern_example;
//concrete command
public class StopComp implements Command{
    Comp computer;

    public StopComp(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
