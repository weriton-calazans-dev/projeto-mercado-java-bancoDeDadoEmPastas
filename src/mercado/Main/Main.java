package mercado.Main;

import mercado.view.PrimeiroMenu;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        PrimeiroMenu primeiroMenu = new PrimeiroMenu();

        System.out.println(primeiroMenu.primeiroMenu());

        primeiroMenu.opcaoPrimeiroMenu();

    }
}


