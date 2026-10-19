package mercado.view;

import java.util.Scanner;

public class LeituraScanner {

    private Scanner input;

    public LeituraScanner(){
        this.input = new Scanner(System.in);
    }

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
