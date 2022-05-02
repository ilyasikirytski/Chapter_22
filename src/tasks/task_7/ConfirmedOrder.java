package tasks.task_7;

public class ConfirmedOrder implements State {
    private String name;

    public ConfirmedOrder(String name) {
        this.name = name;
    }

    @Override
    public void getStateOfOrder() {
        System.out.println("order is confirmed");
    }

    @Override
    public String getName() {
        return name;
    }
}
