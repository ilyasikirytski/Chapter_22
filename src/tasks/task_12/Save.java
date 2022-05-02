package tasks.task_12;

public class Save {
    private String header;
    private String article;

    public Save(String header, String article) {
        this.header = header;
        this.article = article;
    }

    public String getHeader() {
        return header;
    }

    public String getArticle() {
        return article;
    }

    @Override
    public String toString() {
        return "Save{" +
                "header='" + header + '\'' +
                ", article='" + article + '\'' +
                '}';
    }
}
