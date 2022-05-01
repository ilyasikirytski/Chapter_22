package task_5;

import java.util.ArrayList;
import java.util.List;

public class PostalOffice implements Observer, Observed {
    private List<Magazine> magazines;
    private List<Book> books;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.handleEvent("вам высланы новые книги и журналы", magazines, books);
        }
    }

    @Override
    public void handleEvent(String s, List<Magazine> magazines, List<Book> books) {
        this.books = books;
        this.magazines = magazines;
        System.out.println(s);
    }
}
