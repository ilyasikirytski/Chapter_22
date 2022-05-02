package tasks.task_5;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observed {
    private List<Magazine> magazines;
    private List<Book> books;
    private List<Observer> postalOffices = new ArrayList<>();

    public Publisher(List<Magazine> magazines, List<Book> books) {
        this.magazines = magazines;
        this.books = books;
    }

    @Override
    public void addObserver(Observer observer) {
        postalOffices.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : postalOffices) {
            observer.handleEvent("publisher publish new books an magazines ", magazines, books);
        }
    }
}
