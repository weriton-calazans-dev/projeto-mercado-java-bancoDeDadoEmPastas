package mercado.Main;

import mercado.controller.ProprietarioController;
import mercado.model.entities.Proprietario;
import mercado.view.MenuProprietario;
import mercado.view.PrimeiroMenu;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        PrimeiroMenu primeiroMenu = new PrimeiroMenu(new MenuProprietario(new ProprietarioController()));
        // PrimeiroMenu primeiroMenu = new PrimeiroMenu(new MenuCliente());

        System.out.println(primeiroMenu.primeiroMenu());

        primeiroMenu.opcaoPrimeiroMenu();

    }
}


