package mercado.model.entities;

import mercado.model.entities.enumeracao.CategoriaDoProduto;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    private String nomeProduto;
    private Integer codigoDeBarra;
    private BigDecimal precoDeVenda;
    private CategoriaDoProduto categoriaDoProduto;


    public Produto() {
    }

    public Produto(Integer codigoDeBarra, String nomeProduto,BigDecimal precoDeVenda,CategoriaDoProduto categoriaDoProduto) {
        this.codigoDeBarra = codigoDeBarra;
        this.nomeProduto = nomeProduto;
        this.precoDeVenda = precoDeVenda;
        this.categoriaDoProduto = categoriaDoProduto;
    }

    public BigDecimal getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(BigDecimal precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Integer getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public CategoriaDoProduto getCategoriaDoProduto() {
        return categoriaDoProduto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getNomeProduto(), produto.getNomeProduto()) && Objects.equals(getCodigoDeBarra(), produto.getCodigoDeBarra()) && getCategoriaDoProduto() == produto.getCategoriaDoProduto();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeProduto(), getCodigoDeBarra(), getCategoriaDoProduto());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nomeProduto).append('\n');
        sb.append(codigoDeBarra).append('\n');
        sb.append(precoDeVenda).append('\n');
        sb.append(categoriaDoProduto.getDescricao()).append('\n');

        return sb.toString();
    }
}
