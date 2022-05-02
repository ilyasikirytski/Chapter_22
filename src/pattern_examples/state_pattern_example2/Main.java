package pattern_examples.state_pattern_example2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i < 14; i++) {
            human.goSomething();
        }
    }
}
