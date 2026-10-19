package mercado.exceptions;

public class DominiDeExceptions extends RuntimeException {
   //identificador para controle de versão em serialização de objetos
    private static final long serialVersionUID = 1L;

    //construtor apenas a mensagem de erro
    public DominiDeExceptions(String mensagem){
        super(mensagem);
    }

    //construtor mensagem + exceções originais (causa raiz)
    public DominiDeExceptions(String mensagem, Throwable causa){
        super(mensagem,causa);
    }
}
