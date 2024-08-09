package decorator;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(Notifier wrapped) {
        super(wrapped);
    }

    public void send(String msg) {
        super.send(msg);
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending " + msg + " on Facebook to " + fbName);
    }
}