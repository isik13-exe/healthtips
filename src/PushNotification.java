public class PushNotification implements NotificationChannel {
    @Override
    public void send(String title, String message) {
        System.out.println("Sending Push Notification:");
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        System.out.println("--- Push Notification Sent ---\n");
    }
}