public class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(){};

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String send(String message) {
        return message;
    }
 
}
