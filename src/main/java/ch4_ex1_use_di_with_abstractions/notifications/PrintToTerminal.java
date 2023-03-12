package ch4_ex1_use_di_with_abstractions.notifications;

import org.springframework.stereotype.Component;

@Component
public class PrintToTerminal  implements Printer {
    @Override
    public void print(AbstractNotification notification) {
        System.out.println();
        System.out.println(notification.toString());
    }
}
