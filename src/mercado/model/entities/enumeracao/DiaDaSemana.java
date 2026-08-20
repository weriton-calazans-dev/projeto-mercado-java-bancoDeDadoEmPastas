package mercado.model.entities.enumeracao;

public enum DiaDaSemana {
    SEGUNDA(1,"Segunda-feira"),
    TERCA(2,"Terça-feira"),
    QUARTA(3,"Quarta-feira"),
    QUINTA(4,"Quinta-feira"),
    SEXTA(5,"Sexta-feira");

    private final int codigo;
    private final String descricao;

    private DiaDaSemana(int codigo, String descricao) {
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
