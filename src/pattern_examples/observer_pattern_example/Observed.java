package pattern_examples.observer_pattern_example;

public interface Observed {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
