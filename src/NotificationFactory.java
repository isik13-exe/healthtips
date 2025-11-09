public class NotificationFactory {
    public static Notification createNotification(String notificationType, NotificationChannel channel) {
        return switch (notificationType.toLowerCase()) {
            case "meal" -> new MealPlanReminder(channel);
            case "recipe" -> new HealthyRecipeNotification(channel);
            case "tip" -> new NutritionTipNotification(channel);
            default -> throw new IllegalArgumentException("Unknown notification type: " + notificationType);
        };
    }

    public static NotificationChannel createChannel(String channelType) {
        return switch (channelType.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown channel type: " + channelType);
        };
    }
}