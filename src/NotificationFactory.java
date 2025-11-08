public class NotificationFactory {
    public static Notification createNotification(String notificationType, NotificationChannel channel) {
        switch (notificationType.toLowerCase()) {
            case "meal":
                return new MealPlanReminder(channel);
            case "recipe":
                return new HealthyRecipeNotification(channel);
            case "tip":
                return new NutritionTipNotification(channel);
            default:
                throw new IllegalArgumentException("Unknown notification type: " + notificationType);
        }
    }

    public static NotificationChannel createChannel(String channelType) {
        switch (channelType.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel type: " + channelType);
        }
    }
}