public class MealPlanReminder extends Notification {
    public MealPlanReminder(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void send() {
        channel.send("Meal Plan Reminder", "Don't forget your lunch at 1 PM!");
    }
}