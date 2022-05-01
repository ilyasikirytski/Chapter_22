package task_5;

import java.util.Arrays;
import java.util.List;

public class Subscriber2 implements Observer {
    @Override
    public void handleEvent(String s, List<Magazine> magazines, List<Book> books) {
        System.out.println("subscriber2 get message from postOffice: " + s + Arrays.toString(magazines.toArray()) + Arrays.toString(books.toArray()));
    }
}
