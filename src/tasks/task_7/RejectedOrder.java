package tasks.task_7;

public class RejectedOrder implements State {
    private String name;

    public RejectedOrder(String name) {
        this.name = name;
    }

    @Override
    public void getStateOfOrder() {
        System.out.println("order is rejected");
    }

    @Override
    public String getName() {
        return name;
    }
}
