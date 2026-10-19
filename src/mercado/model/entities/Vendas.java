package mercado.model.entities;

import java.util.Objects;

public class Vendas {

    private Produto produto;
    private Integer quantidade;

    public Vendas() {
    }

    public Vendas(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vendas vendas = (Vendas) o;
        return Objects.equals(getProduto(), vendas.getProduto()) && Objects.equals(getQuantidade(), vendas.getQuantidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduto(), getQuantidade());
    }

    @Override
    public String toString() {
        return "     Vendas" + '\n' +
                "Produto: " + produto +
                "Quantidade: " + quantidade;
    }
}
