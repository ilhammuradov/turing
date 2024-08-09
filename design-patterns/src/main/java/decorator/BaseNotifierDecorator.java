package decorator;

public abstract class BaseNotifierDecorator implements Notifier {

    private final Notifier wrapped;
    protected final DatabaseService databaseService;

    BaseNotifierDecorator(Notifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }


    public void send(String msg) {
        wrapped.send(msg);
    }


    public String getUsername() {
        return wrapped.getUsername();
    }
}
