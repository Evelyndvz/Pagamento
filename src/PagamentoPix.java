public class PagamentoPix extends FormaDePagamento {
    @Override
    public void processarPagamento() {
        IO.println("Seu pix foi realizado com sucesso"
        + "\n o código da operação é:"
                + getCodigo() + "\n Data de pagamento"
                + getDatacriacao()
        );
    }
}
