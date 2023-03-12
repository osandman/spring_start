package ch4_ex1_use_di_with_abstractions.main;

import ch4_ex1_use_di_with_abstractions.configuration.ProjectConfig;
import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;
import ch4_ex1_use_di_with_abstractions.notifications.Comment;
import ch4_ex1_use_di_with_abstractions.services.NotificationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        AbstractNotification notification = new Comment("Igor", "Hello!");
        var service = context.getBean(NotificationService.class);
        service.publishNotification(notification);
        notification.setText("I am OK");
        notification.setAuthor("Elena");
        service.publishNotification(notification, "viktor@mail.ru");
    }

}
