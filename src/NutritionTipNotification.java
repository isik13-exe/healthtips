public class NutritionTipNotification extends Notification {
    public NutritionTipNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void send() {
        channel.send("Weekly Nutrition Tip", "Drink water reminder!");
    }
}