package ch4_ex1_use_di_with_abstractions.repositories;

import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;

public interface NotificationRepository {
    void storeNotification(AbstractNotification notification);
}
