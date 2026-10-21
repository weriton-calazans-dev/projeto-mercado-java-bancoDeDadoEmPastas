package mercado.view;

import mercado.util.ValidacaoUtil;

import java.math.BigDecimal;
import java.util.Scanner;

public interface InterLeituraScanner {

    Scanner input = new Scanner(System.in);


    default String escolhaUsuario(){
        String escolhaUsuario = input.nextLine();
        return escolhaUsuario;
    }

    default String leituraCpf (){
        String numeroCpf;
        Boolean validar;
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
    default String leituraNome () {
        String nomePessoa;
        Boolean validar;
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
    default String numeroCelular(){
        System.out.println("Digite o número do celular: ");
        String numeroCelular = input.nextLine();
        return numeroCelular;
    }
    default String nomeProduto(){
        System.out.println("Digite o nome do produto: ");
        String produto = input.nextLine();
        return produto;
    }
    default Integer codigoDeBarra(){
        System.out.println("Digite o número do código de barra: ");
        Integer codigoDeBarra = input.nextInt();
        input.nextLine();
        return codigoDeBarra;
    }
    default BigDecimal precoDeVenda(){
        System.out.println("Digite o preço de venda: ");
        BigDecimal precoDeVenda = input.nextBigDecimal();
        return precoDeVenda;
    }
    default Integer quantidadePacoteEntrada(){
        System.out.println("Digite a quantidade de pacote de entrada: ");
        Integer quantidadePacoteEntrada = input.nextInt();
        return quantidadePacoteEntrada;
    }
    default BigDecimal precoDaCompra(){
        System.out.println("Digite o valor da compro do produto por pacote: ");
        BigDecimal precoDaCompra = input.nextBigDecimal();
        return precoDaCompra;
    }

    default String senha(){
        String senha;
        Boolean validar;
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
    default String enderecoDaLoja(){
        String enderecoDaLoja;
        Boolean validar;
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
    default String nomeDaLoja(){
        String nomeDaLoja;
        Boolean validar;
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
    default Integer quantidadeDePacote(){
        System.out.println("Digite a quantidade de pacote: ");
        Integer quantidadeDePacote = input.nextInt();
        input.nextLine();
        return quantidadeDePacote;
    }

    default void fecharScaner (){
        input.close();
    }
}
