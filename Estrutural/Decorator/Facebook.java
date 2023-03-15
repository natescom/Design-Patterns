public class Facebook extends NotifierDecorator {

    public Facebook(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return notifier.send(message) + " -> Facebook";
    }
}
