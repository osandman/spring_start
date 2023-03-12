package ch4_ex1_use_di_with_abstractions.proxies;

import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class PushNotificationProxy extends AbstractNotificationProxy {
    private final String device;

    public PushNotificationProxy(@Value("notification.push") String email) {
        this.device = email;
    }

    @Override
    public void sendNotification(AbstractNotification notification) {
        System.out.println("# Send notification to: " + device);
    }
}
