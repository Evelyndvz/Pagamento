import java.time.LocalDate;

public abstract class FormaDePagamento {
    private int codigo = 0;
    private LocalDate datacriacao;
    //instant

    public abstract void processarPagamento();

    public int getCodigo() {
        codigo +=1;
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriaacao(LocalDate datacriacao) {
        this.datacriacao = datacriacao;
    }

    public FormaDePagamento() {
        this.datacriacao = LocalDate.now(); // pega a data de agora
    }
}
