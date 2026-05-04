package main;

public class CartaoStrategy implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado no cartão de crédito.");
    }
}