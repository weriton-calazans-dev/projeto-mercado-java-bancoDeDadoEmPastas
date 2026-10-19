package mercado.Main;

import mercado.view.LeituraScanner;
import mercado.view.Menus;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        Menus menuPrincipal = new Menus();
        LeituraScanner leituraScanner = new LeituraScanner();
        System.out.println(menuPrincipal.primeiroMenu());
        try {

            int palavra =leituraScanner.leituraNumero();
            System.out.println(palavra);

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }



        /*EntradaDeMercadoria mercadoria;
        mercadoria = new EntradaDeMercadoria("10/10/2000",new Produto(11111,"arros",new BigDecimal("15.0"), CategoriaDoProduto.ALIMENTOS),10,new BigDecimal(10.0));
        Proprietario proprietario = new Proprietario(12345,"rua santo amaro","Gessinha Mercado","gessinha",1234);
        Proprietario proprietario2 = new Proprietario(12345,"rua santo amaro","Gessinha Mercado","eto",1234);

        System.out.println(mercadoria.toString());
        ProprietarioDAO pro = new ProprietarioDAO();
        //pro.cadastraProprietario(proprietario);
        pro.cadastraProprietario(proprietario2);*/

    }
}


