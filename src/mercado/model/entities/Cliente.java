package mercado.model.entities;

import java.util.Objects;

public class Cliente {
    private String nomeCliente;
    private Integer codigoCliente;

    public Cliente() {
    }

    public Cliente(Integer codigoCliente, String nomeCliente) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getNomeCliente(), cliente.getNomeCliente()) && Objects.equals(getCodigoCliente(), cliente.getCodigoCliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeCliente(), getCodigoCliente());
    }

    @Override
    public String toString() {
        return "Cliente: " + nomeCliente + '\n' +
                "Código Cliente: " + codigoCliente ;
    }
}
