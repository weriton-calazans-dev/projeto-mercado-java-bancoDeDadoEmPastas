package mercado.view;

public class PrimeiroMenu implements InterLeituraScanner {

    private InterMenuProprietario interMeuProprietario;

    public PrimeiroMenu(){
    }

    public PrimeiroMenu(InterMenuProprietario interMeuProprietario){
        this.interMeuProprietario = interMeuProprietario;
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

        String opcaoUsuario = escolhaUsuario();

        if(opcaoUsuario.equals("1")){
            interMeuProprietario.proprietarioMenu();
            String opcao = escolhaUsuario();
            if(opcao.equals("1")){
               interMeuProprietario.cadastraProprietario();
            }

        }

        if(opcaoUsuario.equals("2")){

        }

        fecharScaner();
    }


}
