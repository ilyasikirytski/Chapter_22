package task_7;

public class CreatedOrder implements State {
    private String name;

    public CreatedOrder(String name) {
        this.name = name;
    }

    @Override
    public void getStateOfOrder() {
        System.out.println("order is created");
    }

    @Override
    public String getName() {
        return name;
    }
}
