package mercado.model.entities;

import java.util.Objects;

public class Proprietario {

    private String nomeProprietario;
    private String cpf;
    private String senha;
    private String enderecoDaLoja;
    private String nomeDaLoja;

    public Proprietario() {
    }

    public Proprietario(String cpf, String enderecoDaLoja, String nomeDaLoja, String nomeProprietario, String senha) {
        this.cpf = cpf;
        this.enderecoDaLoja = enderecoDaLoja;
        this.nomeDaLoja = nomeDaLoja;
        this.nomeProprietario = nomeProprietario;
        this.senha = senha;
    }

    public String getEnderecoDaLoja() {
        return enderecoDaLoja;
    }

    public void setEnderecoDaLoja(String enderecoDaLoja) {
        this.enderecoDaLoja = enderecoDaLoja;
    }

    public String getNomeDaLoja() {
        return nomeDaLoja;
    }

    public void setNomeDaLoja(String nomeDaLoja) {
        this.nomeDaLoja = nomeDaLoja;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Proprietario that = (Proprietario) o;
        return Objects.equals(getNomeProprietario(), that.getNomeProprietario()) && Objects.equals(getCpf(), that.getCpf()) && Objects.equals(getSenha(), that.getSenha()) && Objects.equals(getEnderecoDaLoja(), that.getEnderecoDaLoja()) && Objects.equals(getNomeDaLoja(), that.getNomeDaLoja());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeProprietario(), getCpf(), getSenha(), getEnderecoDaLoja(), getNomeDaLoja());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proprietário-> ");
        sb.append(getNomeProprietario()).append('\n');
        sb.append("Cpf-> ");
        sb.append(getCpf()).append('\n');
        sb.append("Senha-> ");
        sb.append(getSenha()).append('\n');
        sb.append("Endereço da loja-> ");
        sb.append(getEnderecoDaLoja()).append('\n');
        sb.append("Nome da loja-> ");
        sb.append(getNomeDaLoja()).append('\n');

        return sb.toString();

    }
}
