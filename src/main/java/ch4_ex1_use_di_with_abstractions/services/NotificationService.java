package ch4_ex1_use_di_with_abstractions.services;

import ch4_ex1_use_di_with_abstractions.notifications.AbstractNotification;
import ch4_ex1_use_di_with_abstractions.notifications.Printer;
import ch4_ex1_use_di_with_abstractions.proxies.AbstractNotificationProxy;
import ch4_ex1_use_di_with_abstractions.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private AbstractNotificationProxy proxy;

    private final NotificationRepository repository;
    private final Printer printer;

    public NotificationService(@Qualifier("EMAIL") AbstractNotificationProxy proxy,
                               NotificationRepository repository,
                               Printer printer) {
        this.proxy = proxy;
        this.repository = repository;
        this.printer = printer;
    }

    public void publishNotification(AbstractNotification notification) {
        printer.print(notification);
        proxy.sendNotification(notification);
        repository.storeNotification(notification);
    }
    public void publishNotification(AbstractNotification notification, String sendTo) {
        proxy.setSentTo(sendTo);
        publishNotification(notification);
    }
    public void setProxy(AbstractNotificationProxy proxy) {
        this.proxy = proxy;
    }

}
