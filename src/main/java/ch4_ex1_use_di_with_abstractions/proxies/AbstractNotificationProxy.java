package ch4_ex1_use_di_with_abstractions.proxies;

import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;

public abstract class AbstractNotificationProxy implements NotificationProxy {
    private String sentTo;

    public String getSentTo() {
        return sentTo;
    }

    public void setSentTo(String sentTo) {
        this.sentTo = sentTo;
    }

    @Override
    public abstract void sendNotification(AbstractNotification notification);
}
