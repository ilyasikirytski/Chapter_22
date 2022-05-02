package tasks.task_12;

/*
Паттерн Memento. Существует набор статей в википедии.
Реализовать процесс раздачи статей по требованию для изменения,
сохраняя исходный вариант для возможного восстановления статьи в исходном виде.
 */
public class Main {
    public static void main(String[] args) {
//      create original article
        Article article = new Article("hello world", "hello my name is ilya");
        System.out.println(article);
//        save original article
        File saveFile = new File();
        saveFile.setSave(article.save());
//        get article for changing
        article.changeArticle("bye world", "bye bye");
        System.out.println("changed article: " + article);
        System.out.println("original article: " + saveFile.getSave());
    }
}
