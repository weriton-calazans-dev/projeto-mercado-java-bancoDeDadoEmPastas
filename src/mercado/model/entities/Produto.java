package mercado.model.entities;

import java.util.Objects;

public class Produto {
    private Integer codigoDeBarra;
    private String nomeProduto;
    private Double preco;

    public Produto() {
    }

    public Produto(Integer codigoDeBarra, String nomeProduto,Double preco) {
        this.codigoDeBarra = codigoDeBarra;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public Integer getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(Integer codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getCodigoDeBarra(), produto.getCodigoDeBarra()) && Objects.equals(getNomeProduto(), produto.getNomeProduto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoDeBarra(), getNomeProduto());
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto + '\n' +
                "Código De Barra: " + codigoDeBarra + '\n' +
                "Preço: " + String.format("%.2f",preco);
    }
}
