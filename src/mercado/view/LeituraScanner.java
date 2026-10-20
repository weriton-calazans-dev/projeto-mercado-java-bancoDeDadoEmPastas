package mercado.view;

import mercado.util.ValidacaoUtil;

import java.math.BigDecimal;
import java.util.Scanner;

public  class LeituraScanner {

    private Scanner input;
    private Boolean validar;

    public LeituraScanner(){
        this.input = new Scanner(System.in);
    }

    public String escolhaUsuario(){
        String escolhaUsuario = input.nextLine();
        return escolhaUsuario;
    }

    public String leituraCpf (){
        String numeroCpf;

        do{
            System.out.println("Digite o seu Cpf ( Ex: 123456789-00 ) ");
            numeroCpf = input.nextLine();
            validar = ValidacaoUtil.validarCpf(numeroCpf);
            if(!validar){
                System.out.println("Número do CPF invalido! ");
            }
        } while (validar == false);

        return numeroCpf;
    }
    public String leituraNome () {
        String nomePessoa;

        do {
            System.out.println("Digite seu Nome: ");
            nomePessoa = input.nextLine();
            validar = ValidacaoUtil.validarNome(nomePessoa);
            if(!validar){
                System.out.println("Nome invalido digite apenas letras! ");
            }

        } while (validar == false);

        return nomePessoa;
    }
    public String numeroCelular(){
        System.out.println("Digite o número do celular: ");
        String numeroCelular = input.nextLine();
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
        input.nextLine();
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
        input.nextLine();
        return senha;
    }
    public String enderecoDaLoja(){
        System.out.println("Digite o endereço da loja: ");
        System.out.println("ex: rua: -------,número: --,bairro: -----,cidade: ------");
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
        input.nextLine();
        return quantidadeDePacote;
    }

    public void fecharScaner (){
        input.close();
    }
}
