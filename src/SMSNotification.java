public class SMSNotification implements NotificationChannel {
    @Override
    public void send(String title, String message) {
        System.out.println("Sending SMS:");
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        System.out.println("--- SMS Sent ---\n");
    }
}