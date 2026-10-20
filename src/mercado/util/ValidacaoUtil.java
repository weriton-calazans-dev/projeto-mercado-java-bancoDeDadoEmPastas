package mercado.util;

public class ValidacaoUtil {

    private static final String regraNome = "^[a-zA-ZÀ-ÿ ]{2,}$";
    public static Boolean validarNome(String nome){
        if(nome.matches(regraNome)) {
            return true;
        }
        return false;
    }

    private static final String regraCpf = "^[0-9]{9}-[0-9]{2}$";
    public static Boolean validarCpf(String cpf){
       if (cpf.matches(regraCpf)) {
            return true;
       }
       return false;
    }
}
