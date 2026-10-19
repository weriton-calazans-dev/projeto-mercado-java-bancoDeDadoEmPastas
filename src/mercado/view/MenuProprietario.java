package mercado.view;

public class MenuProprietario {

    public void proprietarioMenu(){
        System.out.println(" -----------Bem Vindo----------\n" +
                           "-----Area do Proprietário-----\n" +
                           " 1-> Cadastra um novo mercado\n" +
                           " 2-> Acessar seu mercado\n" +
                           "----Digite o Número Correspondent---\n" +
                           "------------(1 ou 2)--------------");
    }

    public void cadastraProprietario(){
        LeituraScanner leituraScanner = new LeituraScanner();
        leituraScanner.leituraNome();

    }
}
