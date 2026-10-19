package mercado.model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static mercado.util.FormataData.formatarData;

public class EntradaDeMercadoria {
    private Produto produto;
    private Integer quantidadePacotesEntrada;
    private LocalDate dataValidade;
    private BigDecimal precoDaCompra;


    public EntradaDeMercadoria(String dataValidade,Produto produto, Integer quantidadePacotesEntrada,BigDecimal precoDaCompra) {
        this.dataValidade = LocalDate.parse(dataValidade,formatarData);
        this.produto = produto;
        this.quantidadePacotesEntrada = quantidadePacotesEntrada;
        this.precoDaCompra = precoDaCompra;
    }

    public BigDecimal getPrecoDaCompra() {
        return precoDaCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidadePacotesEntrada() {
        return quantidadePacotesEntrada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntradaDeMercadoria that = (EntradaDeMercadoria) o;
        return Objects.equals(getProduto(), that.getProduto()) && Objects.equals(getDataValidade(), that.getDataValidade()) && Objects.equals(getPrecoDaCompra(), that.getPrecoDaCompra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduto(), getDataValidade(), getPrecoDaCompra());
    }

    @Override
    public String toString() {
        return "EntradaDeMercadoria{" +
                "dataValidade=" + dataValidade.format(formatarData) +
                ", produto=" + produto +
                ", quantidadePacotesEntrada=" + quantidadePacotesEntrada +
                '}';
    }
}
