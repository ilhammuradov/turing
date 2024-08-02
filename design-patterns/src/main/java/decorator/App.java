package decorator;

public class App {

    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("ilham")));
        notifyAll.send("Order is ready!!!");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("ilham"));
        notifyFbMail.send("Order is ready!!!");
    }
}
