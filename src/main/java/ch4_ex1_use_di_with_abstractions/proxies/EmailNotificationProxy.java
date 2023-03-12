package ch4_ex1_use_di_with_abstractions.proxies;

import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailNotificationProxy extends AbstractNotificationProxy {

    public EmailNotificationProxy(@Value("${notification.email}") String email) {
        setSentTo(email);
    }

    @Override
    public void sendNotification(AbstractNotification notification) {
        System.out.println("# Send notification to email: " + getSentTo());
    }

}
