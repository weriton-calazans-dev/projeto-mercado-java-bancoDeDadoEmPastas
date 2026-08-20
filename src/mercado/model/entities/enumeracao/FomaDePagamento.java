package mercado.model.entities.enumeracao;

public enum FomaDePagamento {
    PIX(1," Pix "),
    CARTAO(2," Cartão "),
    DINHEIRO(3," Dinheiro ");

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
