public class Main {
    public static void main(String[] args) {
        Notifier notifier = new NotifierDecorator();
        NotifierDecorator notifierDecorado = new Sms(notifier);

        System.out.println(notifierDecorado.send("ALERTA"));
        notifierDecorado = new Email(new Sms(notifier));
        System.out.println(notifierDecorado.send("ALERTA 2"));
        notifierDecorado = new Facebook(new Email(new Sms(notifier)));
        System.out.println(notifierDecorado.send("ALERTA 3"));
    }
}
