package decorator;

public class App {

    public static void main(String[] args) {

        Notifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new NotifierImpl("Ilham")));
//        notifyAll.send("Order is ready!!!");

        System.out.println("==========================================");

        BaseNotifierDecorator notifyFbMail = new FacebookDecorator(new NotifierImpl("ilham"));
     //   BaseNotifierDecorator notify= new Notifier("eefw");
        notifyFbMail.send("Order is ready!!!");
    }
}
