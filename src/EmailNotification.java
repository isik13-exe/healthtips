public class EmailNotification implements NotificationChannel {
    @Override
    public void send(String title, String message) {
        System.out.println("Sending Email:");
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        System.out.println("--- Email Sent ---\n");
    }
}