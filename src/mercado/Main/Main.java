package mercado.Main;

import mercado.controller.ProprietarioController;
import mercado.dao.repository.GerenciadorDeDadosDAO;
import mercado.dao.repository.ProprietarioDAO;
import mercado.view.MenuProprietario;
import mercado.view.PrimeiroMenu;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        PrimeiroMenu primeiroMenu = new PrimeiroMenu(new MenuProprietario(new ProprietarioController(new ProprietarioDAO(new GerenciadorDeDadosDAO()))));
        // PrimeiroMenu primeiroMenu = new PrimeiroMenu(new MenuCliente());

        System.out.println(primeiroMenu.primeiroMenu());

        primeiroMenu.opcaoPrimeiroMenu();

    }
}


