package tasks.task_12;

public class Article {
    private String header;
    private String article;

    public Article(String header, String article) {
        this.header = header;
        this.article = article;
    }

    public void changeArticle(String newHeader, String newArticle) {
        this.header = newHeader;
        this.article = newArticle;
    }

    public Save save() {
        return new Save(header, article);
    }

    @Override
    public String toString() {
        return "Article{" +
                "header='" + header + '\'' +
                ", article='" + article + '\'' +
                '}';
    }
}
