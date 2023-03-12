package ch4_ex1_use_di_with_abstractions.proxies;

import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;

public interface NotificationProxy {
    void sendNotification(AbstractNotification notification);
}
