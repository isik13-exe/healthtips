import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Smart Notification System ==");
        System.out.println("Available notification types:");
        System.out.println("1. Meal Plan Reminder (type 'meal')");
        System.out.println("2. Healthy Recipe (type 'recipe')");
        System.out.println("3. Nutrition Tip (type 'tip')");

        System.out.print("\nSelect notification type: ");
        String notificationType = scanner.nextLine();

        System.out.println("\nAvailable channels:");
        System.out.println("1. Email (type 'email')");
        System.out.println("2. SMS (type 'sms')");
        System.out.println("3. Push Notification (type 'push')");

        System.out.print("\nSelect channel: ");
        String channelType = scanner.nextLine();

        try {
            // Create channel and notification using factory
            NotificationChannel channel = NotificationFactory.createChannel(channelType);
            Notification notification = NotificationFactory.createNotification(notificationType, channel);

            System.out.println("\n=== Sending Notification ===");
            System.out.println("User selected: " + channelType.toUpperCase());
            notification.send();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();

    }

    private static void demonstrateExtendability() {
        System.out.println("Demonstrating how easy it is to add new channels:");

        NutritionTipNotification tip = new NutritionTipNotification(new SMSNotification());
        tip.send();

        NutritionTipNotification emailTip = new NutritionTipNotification(new EmailNotification());
        emailTip.send();

        NutritionTipNotification pushTip = new NutritionTipNotification(new PushNotification());
        pushTip.send();
    }
}