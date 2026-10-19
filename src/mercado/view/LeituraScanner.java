package mercado.view;

import java.math.BigDecimal;
import java.util.Scanner;

public  class LeituraScanner {

    private Scanner input;

    public LeituraScanner(){
        this.input = new Scanner(System.in);
    }
    public String escolhaUsuario(){
        String escolhaUsuario = input.nextLine();
        return escolhaUsuario;
    }

    public Integer leituraCpf (){
        System.out.println("Digite o seu Cpf ( Ex: 123456789-00 ) ");
        Integer numeroCpf = input.nextInt();
        return numeroCpf;
    }
    public String leituraNome (){
        System.out.println("Digite seu Nome: ");
        String nomePessoa = input.nextLine();
        return nomePessoa;
    }
    public Integer numeroCelular(){
        System.out.println("Digite o número do celular: ");
        Integer numeroCelular = input.nextInt();
        return numeroCelular;
    }
    public String nomeProduto(){
        System.out.println("Digite o nome do produto: ");
        String produto = input.nextLine();
        return produto;
    }
    public Integer codigoDeBarra(){
        System.out.println("Digite o número do código de barra: ");
        Integer codigoDeBarra = input.nextInt();
        return codigoDeBarra;
    }
    public BigDecimal precoDeVenda(){
        System.out.println("Digite o preço de venda: ");
        BigDecimal precoDeVenda = input.nextBigDecimal();
        return precoDeVenda;
    }
    public Integer quantidadePacoteEntrada(){
        System.out.println("Digite a quantidade de pacote de entrada: ");
        Integer quantidadePacoteEntrada = input.nextInt();
        return quantidadePacoteEntrada;
    }
    public BigDecimal precoDaCompra(){
        System.out.println("Digite o valor da compro do produto por pacote: ");
        BigDecimal precoDaCompra = input.nextBigDecimal();
        return precoDaCompra;
    }
    //este método deve ser analisado posteriormente para aceita uma senha forte com letras e numero.
    public Integer senha(){
        System.out.println("Digite sua senha: ");
        Integer senha = input.nextInt();
        return senha;
    }
    public String enderecoDaLoja(){
        System.out.println("Digite o endereço da loja: ");
        System.out.println("ex: rua: -------;número: --;bairro: -----;cidade: ------");
        input.nextLine();
        String enderecoDaLoja = input.nextLine();
        return enderecoDaLoja;
    }
    public String nomeDaLoja(){
        System.out.println("Digite o nome da loja: ");
        String nomeDaLoja = input.nextLine();
        return nomeDaLoja;
    }
    public Integer quantidadeDePacote(){
        System.out.println("Digite a quantidade de pacote: ");
        Integer quantidadeDePacote = input.nextInt();
        return quantidadeDePacote;
    }
    public void fecharScaner (){
        input.close();
    }
}
