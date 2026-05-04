package main;

public class Pedido {
    private double valorTotal;
    private PagamentoStrategy pagamentoStrategy;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void fecharPedido() {
        if (pagamentoStrategy == null) {
            throw new IllegalStateException("Forma de pagamento não definida!");
        }
        pagamentoStrategy.pagar(valorTotal);
    }
}