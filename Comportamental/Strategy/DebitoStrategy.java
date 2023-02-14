public class DebitoStrategy implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento no débito");
    }
    
}
