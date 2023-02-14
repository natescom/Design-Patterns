public class Main{

    public static void main(String[] args) {
        Pagamento pagamento = new CreditoStrategy();
        pagamento.processarPagamento(50);

        pagamento = new DebitoStrategy();
        pagamento.processarPagamento(50);

        pagamento = new PixStrategy();
        pagamento.processarPagamento(50);
    }

}