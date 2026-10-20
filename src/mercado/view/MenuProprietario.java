package mercado.view;

import mercado.controller.ProprietarioController;
import mercado.model.entities.Proprietario;

public class MenuProprietario {

    private LeituraScanner leituraScanner;
    private ProprietarioController proprietarioController;
    private Proprietario proprietario;

    public MenuProprietario(){
        this.leituraScanner = new LeituraScanner();
        this.proprietarioController = new ProprietarioController();
        this.proprietario = new Proprietario();
    }

    public void proprietarioMenu(){
        System.out.println("-----------------Bem Vindo---------------\n" +
                           "-------------Area do Proprietário--------\n" +
                           " 1-> Cadastra um novo mercado\n" +
                           " 2-> Acessar seu mercado\n" +
                           "---------Digite o Número Correspondent----\n" +
                           "------------------(1 ou 2)----------------\n");
    }

    public void executarCadastro(){
       try{
            System.out.println("-----------Cadastro do Proprietário-------------");
            System.out.println();
            String nome = leituraScanner.leituraNome();
            String cpf = leituraScanner.leituraCpf();
            Integer senha = leituraScanner.senha();
            String enderecoDaLoja = leituraScanner.enderecoDaLoja();
            String nomeDaLoja = leituraScanner.nomeDaLoja();

            Proprietario cadastradoComSucesso = proprietarioController.cadastraProprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);

           System.out.println("\nProprietário cadastrado com sucesso.");
           System.out.println();
           System.out.println(cadastradoComSucesso.toString());
       } catch (Exception e) {
           System.out.println("\n Erro! Cadastro nào efetuado. " + e.getStackTrace());
       }
    }
}
