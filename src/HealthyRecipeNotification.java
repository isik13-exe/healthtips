public class HealthyRecipeNotification extends Notification {
    public HealthyRecipeNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void send() {
        channel.send("New Healthy Recipe", "Check out our new quinoa salad recipe!");
    }
}