package mercado.model.entities.enumeracao;

public enum CategoriaDoProduto {
    ALIMENTOS(1,"Alimentos"),
    LIMPEZA(2,"Limpeza"),
    BEBIDAS(3,"Bebidas"),
    HORTIFRUTI(4,"Hortifruti");

    private final int codigo;
    private final String descricao;

    CategoriaDoProduto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
