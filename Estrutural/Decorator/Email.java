public class Email extends NotifierDecorator {

    public Email(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return notifier.send(message) + " -> Email";
    }
    
}
