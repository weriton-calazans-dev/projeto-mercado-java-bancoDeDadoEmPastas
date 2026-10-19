package mercado.view;

import mercado.controller.ProprietarioController;

public class MenuProprietario {

    private LeituraScanner leituraScanner;
    private ProprietarioController proprietarioController;

    public MenuProprietario(){
        this.leituraScanner = new LeituraScanner();
        this.proprietarioController = new ProprietarioController();
    }

    public void proprietarioMenu(){
        System.out.println(" -----------Bem Vindo----------\n" +
                           "-----Area do Proprietário-----\n" +
                           " 1-> Cadastra um novo mercado\n" +
                           " 2-> Acessar seu mercado\n" +
                           "----Digite o Número Correspondent---\n" +
                           "------------(1 ou 2)--------------");
    }

    public void executarCadastro(){
        String nome = leituraScanner.leituraNome();
        Integer cpf = leituraScanner.leituraCpf();
        Integer senha = leituraScanner.senha();
        String enderecoDaLoja = leituraScanner.enderecoDaLoja();
        String nomeDaLoja = leituraScanner.nomeDaLoja();

        Boolean cadastradoComSucesso = proprietarioController.cadastraProprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);

        if(cadastradoComSucesso){
            System.out.println("Cadastro efetuado com sucesso!");
        }
        else{
            System.out.println("Não foi possível realizar o cadastro.");
        }
    }
}
