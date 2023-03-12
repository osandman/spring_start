package ch4_ex1_use_di_with_abstractions.notifications;

public abstract class AbstractNotification {
    private String author;
    private String text;

    public AbstractNotification(String author, String text) {
        this.author = author;
        this.text = text;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "New notification: \n{" +
               "author='" + author + '\'' +
               ", text='" + text + '\'' +
               '}';
    }
}
