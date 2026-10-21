package mercado.view;

import mercado.controller.InterProprietarioController;
import mercado.model.entities.Proprietario;

public class MenuProprietario implements InterLeituraScanner,InterMeuProprietario {

    private InterProprietarioController interProprietarioController;

    public MenuProprietario(InterProprietarioController interProprietarioController){
        this.interProprietarioController = interProprietarioController;
    }


    public void proprietarioMenu(){
        System.out.println("-----------------Bem Vindo---------------\n" +
                           "-------------Area do Proprietário--------\n" +
                           " 1-> Cadastra um novo mercado\n" +
                           " 2-> Acessar seu mercado\n" +
                           "---------Digite o Número Correspondent----\n" +
                           "------------------(1 ou 2)----------------\n");
    }

    @Override
    public void cadastraProprietario() {
        try{
            System.out.println("-----------Cadastro do Proprietário-------------");
            System.out.println();
            String nome= leituraNome();
            String cpf = leituraCpf();
            String senha = senha();
            String enderecoDaLoja = enderecoDaLoja();
            String nomeDaLoja = nomeDaLoja();

            Proprietario cadastradoComSucesso = new Proprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);


            System.out.println("\nProprietário cadastrado com sucesso.");
            System.out.println();
            System.out.println(cadastradoComSucesso.toString());
            interProprietarioController.cadastraProprietario(cadastradoComSucesso);
        } catch (Exception e) {
            System.out.println("\n Erro! Cadastro nào efetuado. " + e.getStackTrace());
        }
    }

    public void acessarMercado() {

    }
}
