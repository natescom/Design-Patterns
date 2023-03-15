public class Sms extends NotifierDecorator {
    
    public Sms(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return notifier.send(message) + " -> SMS";
    }
    
}
