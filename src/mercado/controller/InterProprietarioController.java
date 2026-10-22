package mercado.controller;

import mercado.model.entities.Proprietario;

public interface InterProprietarioController {
    public void cadastraProprietario(String cpf,String enderecoDaLoja,String nomeDaLoja,String nome,String senha);
    public void acessarMercado();
}
