package tasks.task_5;

import java.util.ArrayList;

/*
Паттерн Observer. Разработать систему Почтовое отделение.
Из издательства в почтовое отделение поступают издаваемые газеты и журналы.
Почтовое отделение отправляет полученные печатные издания соответствующим подписчикам.
 */
public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher(new ArrayList<>() {{
            add(new Magazine("1"));
            add(new Magazine("2"));
            add(new Magazine("3"));
        }}, new ArrayList<>() {{
            add(new Book("1"));
            add(new Book("2"));
            add(new Book("3"));
        }});
        PostalOffice postalOffice1 = new PostalOffice();
        publisher.addObserver(postalOffice1);

        postalOffice1.addObserver(new Subscriber1());
        postalOffice1.addObserver(new Subscriber2());
        postalOffice1.addObserver(new Subscriber3());

        publisher.notifyObserver();
        postalOffice1.notifyObserver();
    }
}
