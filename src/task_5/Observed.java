package task_5;

public interface Observed {
    void addObserver(Observer observer);

    void notifyObserver();
}
