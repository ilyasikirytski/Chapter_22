package tasks.task_7;

public class MyOrder implements State {
    private String name;

    public MyOrder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getStateOfOrder() {
        System.out.println("order submitted to the bureau");
    }
}
