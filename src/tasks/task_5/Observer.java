package tasks.task_5;

import java.util.List;

public interface Observer {
    void handleEvent(String s, List<Magazine> magazines, List<Book> books);
}
