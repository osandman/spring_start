package ch4_ex1_use_di_with_abstractions.repositories;

import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;
import org.springframework.stereotype.Repository;

@Repository
public class DBNotificationRepository implements NotificationRepository {
    @Override
    public void storeNotification(AbstractNotification notification) {
        System.out.println("# Notification stored to DB");
    }
}
