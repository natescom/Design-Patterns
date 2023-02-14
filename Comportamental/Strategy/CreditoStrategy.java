public class CreditoStrategy implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento no crédito");
    }
    
}
