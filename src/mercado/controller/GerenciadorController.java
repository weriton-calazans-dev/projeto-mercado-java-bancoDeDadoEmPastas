package mercado.controller;

import mercado.view.LeituraScanner;
import mercado.view.MenuProprietario;

public class GerenciadorController {

    private LeituraScanner leituraScanner = new LeituraScanner();
    private ProprietarioController proprietarioController = new ProprietarioController();
    private MenuProprietario menuProprietario = new MenuProprietario();

    public String opcao1Usuario(){
        String opcaoUsuario = leituraScanner.escolhaUsuario();
        if(opcaoUsuario.equals("1")){
            menuProprietario.proprietarioMenu();
            String opcao = leituraScanner.escolhaUsuario();
            return opcao2Usuario(opcao);
        }
        if(opcaoUsuario.equals("2")){

        }
        return null;
    }

    public String opcao2Usuario(String  opcao2Usuario){
        if(opcao2Usuario.equals("1")){
            proprietarioController.cadastraProprietario();
           return null;
        }
        return null;
    }
}
