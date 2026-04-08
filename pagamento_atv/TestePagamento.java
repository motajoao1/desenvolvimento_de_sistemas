public class TestePagamento {
    public static void main(String[] args) {
        
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoPix = new Pix();

        pagamentoCartao.processarPagamento(100.00);
        pagamentoPix.processarPagamento(50.00);
    }
}