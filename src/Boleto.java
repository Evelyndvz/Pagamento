import java.time.LocalDate;

public class Boleto extends  FormaDePagamento{
    private LocalDate datavencimento;

    public LocalDate getDatavencimento(){
    return  datavencimento = getDatacriacao().plusDays(10);
}
    @Override
    public void processarPagamento() {
        IO.println("Seu Boleto foi gerado com sucesso!"
        +"\n o código da opreação é:"
                + getCodigo() + "\n Data de criação"
                +getDatacriacao()
                + "A data de vencimento é: "
                + getDatavencimento()
        );
    }
}
