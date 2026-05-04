package main;

public class PedidoTest {

    public static void main(String[] args) {
        System.out.println("Iniciando testes do Strategy...");

        try {
            deveRealizarPagamentoNoCartao();
            System.out.println("TESTE PASSOU: deveRealizarPagamentoNoCartao");
        } catch (Exception e) {
            System.err.println("TESTE FALHOU: deveRealizarPagamentoNoCartao");
            e.printStackTrace();
        }
    }

    static void deveRealizarPagamentoNoCartao() {
        Pedido pedido = new Pedido(50.0);
        pedido.setPagamentoStrategy(new CartaoStrategy());
        
        // Testa se não lança exceção e altera o estado do pagamento (simulado)
        try {
            pedido.fecharPedido();
        } catch (Exception e) {
            throw new RuntimeException("Falha ao processar a estratégia de pagamento.");
        }
    }
}