package task_7;

public class PostponedOrder implements State {
    private String name;

    public PostponedOrder(String name) {
        this.name = name;
    }

    @Override
    public void getStateOfOrder() {
        System.out.println("order is postponed");
    }

    @Override
    public String getName() {
        return name;
    }
}
