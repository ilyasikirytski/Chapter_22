package task_7;

public class WithdrawnOrder implements State {
    private String name;

    public WithdrawnOrder(String name) {
        this.name = name;
    }

    @Override
    public void getStateOfOrder() {
        System.out.println("order is withdrawn");
    }

    @Override
    public String getName() {
        return name;
    }
}
