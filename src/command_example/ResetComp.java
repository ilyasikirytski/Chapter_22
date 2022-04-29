package command_example;
//concrete command
public class ResetComp implements Command{
    Comp computer;

    public ResetComp(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
