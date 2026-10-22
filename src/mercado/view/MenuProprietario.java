package mercado.view;

import mercado.controller.InterProprietarioController;

public class MenuProprietario implements InterLeituraScanner, InterMenuProprietario {

    private InterProprietarioController interProprietarioController;

    public MenuProprietario(){
    }

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

            interProprietarioController.cadastraProprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);

            System.out.println("\nProprietário cadastrado com sucesso.");
            System.out.println();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void acessarMercado() {

    }
}
