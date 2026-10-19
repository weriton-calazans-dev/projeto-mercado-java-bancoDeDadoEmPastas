package mercado.model.entities.enumeracao;

public enum FomaDePagamento {
    PIX(1," Pix "),
    CARTAO_CREDITO(2," Cartão Credito "),
    CARTAO_DEBITO(3," Cartão Debito "),
    DINHEIRO(4," Dinheiro ");

    private final int codigo;
    private final String descricao;

    private FomaDePagamento(int codigo,String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

}
