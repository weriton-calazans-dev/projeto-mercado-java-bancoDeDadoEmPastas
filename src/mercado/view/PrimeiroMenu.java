package mercado.view;

import mercado.controller.ProprietarioController;

public class PrimeiroMenu {

    private LeituraScanner leituraScanner;
    private MenuProprietario menuProprietario;
    private ProprietarioController proprietarioController;

    public PrimeiroMenu(){
       this.leituraScanner = new LeituraScanner();
       this.menuProprietario = new MenuProprietario();
       this.proprietarioController = new ProprietarioController();
    }

    public String primeiroMenu(){
        return  """
                   ---------------Bem Vindo----------------
                   -------------Mercado Java---------------
                   1-> Proprietário 
                   2-> Cliente
                   -------Digite o Número Correspondent----
                   ----------------(1 ou 2)----------------\s 
                   """;
    }

    public void opcaoPrimeiroMenu(){

        String opcaoUsuario = leituraScanner.escolhaUsuario();

        if(opcaoUsuario.equals("1")){
            menuProprietario.proprietarioMenu();
            String opcao = leituraScanner.escolhaUsuario();
            if(opcao.equals("1")){
                menuProprietario.executarCadastro();
            }

        }

        if(opcaoUsuario.equals("2")){

        }

        leituraScanner.fecharScaner();
    }


}
