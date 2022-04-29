package iterator_pattern_example;

public class Main {
    public static void main(String[] args) {
        String[] tasks = {"1", "2", "3", "4", "5"};
        ConcreteAggregate c = new ConcreteAggregate(tasks);
        Iterator it = c.getIterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}
