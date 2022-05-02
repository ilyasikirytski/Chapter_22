package tasks.task_7;

public class ConsideredOrder implements State {
    private String name;

    public ConsideredOrder(String name) {
        this.name = name;
    }

    @Override
    public void getStateOfOrder() {
        System.out.println("order is considering");
    }

    @Override
    public String getName() {
        return name;
    }
}
