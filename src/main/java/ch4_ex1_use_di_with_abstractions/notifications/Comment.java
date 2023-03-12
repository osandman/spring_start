package ch4_ex1_use_di_with_abstractions.notifications;

public class Comment extends AbstractNotification {
    public Comment(String author, String text) {
        super(author, text);
    }
}
