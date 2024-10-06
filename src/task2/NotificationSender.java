package task2;

public class NotificationSender {
    private Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public void sendBulk(String message, List<String> recipients) {
        for (String recipient : recipients) {
            notification.send(message, recipient);
        }
    }
}

