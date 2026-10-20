package mercado.util;

public class ValidacaoUtil {

    private static final String regraNome = "^[a-zA-ZÀ-ÿ ]{2,}$";
    public static Boolean validarNome(String nome){
        if(nome.equals(null)){
            return false;
        } else if(nome.matches(regraNome)) {
            return true;
        }else {
            return false;
        }
    }
}
