package mercado.model.entities;

import java.util.Objects;

public class Proprietario {
    private String nomeProprietario;
    private Integer cpf;
    private Integer senha;

    public Proprietario() {
    }

    public Proprietario(Integer cpf, String nomeProprietario, Integer senha) {
        this.cpf = cpf;
        this.nomeProprietario = nomeProprietario;
        this.senha = senha;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Proprietario that = (Proprietario) o;
        return Objects.equals(getNomeProprietario(), that.getNomeProprietario()) && Objects.equals(getCpf(), that.getCpf()) && Objects.equals(getSenha(), that.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeProprietario(), getCpf(), getSenha());
    }

    @Override
    public String toString() {
        return "Proprietário: " + '\n' +
                "CPF: " + cpf ;
    }
}
