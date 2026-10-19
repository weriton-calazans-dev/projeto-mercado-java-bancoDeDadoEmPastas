package mercado.model.entities;

import java.util.Objects;

public class Cliente {

    private String nomeCliente;
    private Integer numeroCelular;
    private Integer cpf;

    public Cliente() {
    }

    public Cliente(Integer cpf, String nomeCliente,Integer numeroCelular) {
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
        this.numeroCelular = numeroCelular;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Integer cpf() {
        return cpf;
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
        return Objects.equals(getNomeCliente(), cliente.getNomeCliente()) && Objects.equals(cpf(), cliente.cpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeCliente(), cpf());
    }

    @Override
    public String toString() {
        return "Cliente: " + nomeCliente + '\n' +
                "Número do Celular: " + numeroCelular ;
    }
}
