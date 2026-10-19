package mercado.Main;

import mercado.view.Menus;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Menus menus = new Menus();

        System.out.println(menus.primeiroMenu());

        menus.opcaoPrimeiroMenu();

    }
}


