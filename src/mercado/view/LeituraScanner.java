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

    public String senha(){
        String senha;

        do {
            System.out.println("Digite sua senha de no mínimo 6 digito: ");
            senha = input.nextLine();
            validar = ValidacaoUtil.validarSenha(senha);
            if (!validar){
                System.out.println("Senha invalida! ");
            }
        } while (validar == false);

        return senha;
    }
    public String enderecoDaLoja(){
        String enderecoDaLoja;

        do {
            System.out.println("Digite o endereço da loja: ");
            System.out.println("ex: rua: -------,número: --,bairro: -----,cidade: ------");
            enderecoDaLoja = input.nextLine();
            validar = ValidacaoUtil.valiarEnderecoDaLoja(enderecoDaLoja);
            if (!validar){
                System.out.println("Endereço invalido digite com forme o exemplo a cima! ");
            }
        } while (validar == false);

        return enderecoDaLoja;
    }
    public String nomeDaLoja(){
        String nomeDaLoja;

        do {
            System.out.println("Digite o nome da loja: ");
            nomeDaLoja = input.nextLine();
            validar = ValidacaoUtil.validarNome(nomeDaLoja);
            if(!validar){
                System.out.println("Nome invalido digite apenas letras! ");
            }

        } while (validar == false);

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
