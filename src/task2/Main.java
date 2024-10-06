package task2;

public class Main {
    public static void main(String[] args) {
        Notification sms = new SMSNotification();
        NotificationSender sender = new NotificationSender(sms);
        sender.sendBulk("Hello!", Arrays.asList("12345", "67890"));

        Notification email = new EmailNotification();
        sender = new NotificationSender(email);
        sender.sendBulk("Hello via email!", Arrays.asList("email@example.com", "email2@example.com"));
    }
}