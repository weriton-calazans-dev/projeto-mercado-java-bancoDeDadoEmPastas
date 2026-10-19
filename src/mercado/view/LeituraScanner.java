package mercado.view;

import java.util.Scanner;

public class LeituraScanner {

    Scanner input = new Scanner(System.in);

    public int leituraNumero (){
            return input.nextInt();
    }

    public String leituraPalavra (){
        return input.nextLine();
    }

    public void fecharScaner (){
        input.close();
    }
}
