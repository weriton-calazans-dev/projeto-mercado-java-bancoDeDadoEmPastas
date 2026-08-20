package mercado.model.entities;

import java.util.Objects;

public class EntradaDeMercadoria {
    private String nomeProdutoEntrada;
    private Integer codigoDeBarraEntrada;
    private Integer quantidadePacotesEntrada;

    public EntradaDeMercadoria(Integer codigoDeBarraEntrada, String nomeProdutoEntrada, Integer quantidadePacotesEntrada) {
        this.codigoDeBarraEntrada = codigoDeBarraEntrada;
        this.nomeProdutoEntrada = nomeProdutoEntrada;
        this.quantidadePacotesEntrada = quantidadePacotesEntrada;
    }

    public Integer getCodigoDeBarraEntrada() {
        return codigoDeBarraEntrada;
    }

    public void setCodigoDeBarraEntrada(Integer codigoDeBarraEntrada) {
        this.codigoDeBarraEntrada = codigoDeBarraEntrada;
    }

    public String getNomeProdutoEntrada() {
        return nomeProdutoEntrada;
    }

    public void setNomeProdutoEntrada(String nomeProdutoEntrada) {
        this.nomeProdutoEntrada = nomeProdutoEntrada;
    }

    public Integer getQuantidadePacotesEntrada() {
        return quantidadePacotesEntrada;
    }

    public void setQuantidadePacotesEntrada(Integer quantidadePacotesEntrada) {
        this.quantidadePacotesEntrada = quantidadePacotesEntrada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntradaDeMercadoria that = (EntradaDeMercadoria) o;
        return Objects.equals(getNomeProdutoEntrada(), that.getNomeProdutoEntrada()) && Objects.equals(getCodigoDeBarraEntrada(), that.getCodigoDeBarraEntrada()) && Objects.equals(getQuantidadePacotesEntrada(), that.getQuantidadePacotesEntrada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeProdutoEntrada(), getCodigoDeBarraEntrada(), getQuantidadePacotesEntrada());
    }

    @Override
    public String toString() {
        return "    Entrada De Mercadoria     " + '\n' +
                "Código De Barra Entrada: " + codigoDeBarraEntrada + '\n' +
                "Nome Produto Entrada: " + nomeProdutoEntrada + '\n' +
                "Quantidade Pacotes Entrada: " + quantidadePacotesEntrada ;
    }
}
