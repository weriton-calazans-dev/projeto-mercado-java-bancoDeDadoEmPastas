package mercado.util;

public class ValidacaoUtil {

    private static final String regraNome = "^[a-zA-ZÀ-ÿ ]{2,}$";
    private static final String regraCpf = "^[0-9]{9}-[0-9]{2}$";
    private static final String regraNumeroCelular = "^([0-9]{2})[0-9]{9}$";
    private static final String regraSenha = "^[0-9A-Za-z]{6,}$";
    private static final String regraEnderecoDaLoja = "^rua:\s*[a-zA-ZÀ-ÿ ]+,\s*número:\s*[0-9]+,\s*bairro:\s*[a-zA-ZÀ-ÿ ]+,\s*cidade:\s*[a-zA-ZÀ-ÿ ]+$";

    public static Boolean validarNome(String nome){
        if(nome.matches(regraNome)) {
            return true;
        }
        return false;
    }

    public static Boolean validarCpf(String cpf){
       if (cpf.matches(regraCpf)) {
            return true;
       }
       return false;
    }

    public static Boolean validarNumeroCelular(String numeroCelular){
        if (numeroCelular.matches(regraNumeroCelular)){
            return true;
        }
        return false;
    }

    public static Boolean validarSenha(String senha){
        if (senha.matches(regraSenha)){
            return true;
        }
        return false;
    }

    public static Boolean valiarEnderecoDaLoja(String enderecoDaLoja){
        if (enderecoDaLoja.matches(regraEnderecoDaLoja)){
            return true;
        }
        return false;
    }
}
