package pattern_examples.iterator_pattern_example;

public class ConcreteAggregate implements Aggregate {
    String[] tasks;

    public ConcreteAggregate(String[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
