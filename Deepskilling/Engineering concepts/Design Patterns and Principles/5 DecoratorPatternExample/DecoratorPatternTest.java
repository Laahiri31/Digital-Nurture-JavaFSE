package DecoratorPatternExample;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        // Email only
        Notifier emailNotifier = new EmailNotifier();

        System.out.println("Email Notification:");
        emailNotifier.send("Your order has been placed.");

        System.out.println();

        // Email + SMS
        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS Notification:");
        smsNotifier.send("Your order has been shipped.");

        System.out.println();

        // Email + SMS + Slack
        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack Notification:");
        allNotifier.send("Your order has been delivered.");
    }
}