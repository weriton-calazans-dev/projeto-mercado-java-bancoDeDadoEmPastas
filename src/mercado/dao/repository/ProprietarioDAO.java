package mercado.dao.repository;

import mercado.exceptions.DominiDeExceptions;
import mercado.model.entities.Proprietario;
import mercado.util.CaminhosDados;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ProprietarioDAO implements InterProprietarioDAO {

    private InterGerenciadorDeDadosDAO gerenciadorDeDadosDAO;

    public ProprietarioDAO(InterGerenciadorDeDadosDAO gerenciadorDeDadosDAO){
        this.gerenciadorDeDadosDAO = gerenciadorDeDadosDAO;
    }

    @Override
    public void cadastraProprietario(Proprietario proprietario){

        Path caminhoPastaProprietario = CaminhosDados.caminho.resolve(proprietario.getNomeProprietario());
        Path caminhoArquivoProprietarios = CaminhosDados.caminho.resolve(CaminhosDados.arquivoCadastroProprietariosCsv);
       try {

            if (gerenciadorDeDadosDAO.verificadorCaminhoNaoExiste(caminhoPastaProprietario) && gerenciadorDeDadosDAO.verificadorCaminhoNaoExiste(caminhoArquivoProprietarios)){

                gerenciadorDeDadosDAO.criarPasta(caminhoPastaProprietario);
                gerenciadorDeDadosDAO.criarArquivoCsv(caminhoArquivoProprietarios);
                gerenciadorDeDadosDAO.criarArquivoCsv(caminhoPastaProprietario.resolve(CaminhosDados.arquivoClienteCsv));
                gerenciadorDeDadosDAO.criarArquivoCsv(caminhoPastaProprietario.resolve(CaminhosDados.arquivoVendasCsv));
                gerenciadorDeDadosDAO.criarArquivoCsv(caminhoPastaProprietario.resolve(CaminhosDados.arquivoProduto));
            }

           gerenciadorDeDadosDAO.escritaDaPrimeiraLinha(
                   gerenciadorDeDadosDAO.verificadorCaminhoExiste(caminhoPastaProprietario.resolve(CaminhosDados.arquivoClienteCsv)),
                   "Código Cliente;Nome do Cliente;Número do Celular",
                   caminhoPastaProprietario.resolve(CaminhosDados.arquivoClienteCsv));

           String linhaProprietario = String.join(";",
                   proprietario.getNomeProprietario(),
                   String.valueOf(proprietario.getCpf()),
                   proprietario.getNomeDaLoja(),
                   proprietario.getEnderecoDaLoja(),
                   String.valueOf(proprietario.getSenha()));

           gerenciadorDeDadosDAO.escreverArquivoCsv(linhaProprietario,caminhoArquivoProprietarios);

       } catch (Exception e) {
           throw new RuntimeException(e);
       }


       /* //caminho do diretorio/pasta
        Path caminhoDoProprietario = CaminhosDados.caminho.resolve(proprietario.getNomeProprietario());

        try {
            //pagando apenas a pasta pai
           // Path pasta = caminho.getParent();

            //verificando se o caminho não existe e a pasta pai não existe
            //a variável ArquivoCadasreoProprietariosCSV e o caminho da pasta util
            if (CaminhosDados.caminho.resolve(CaminhosDados.arquivoCadastroProprietariosCsv) != null && Files.notExists(caminhoDoProprietario)){
                //criando a pasta pai se as condições do if for verdadeira
                Files.createDirectories(CaminhosDados.caminho.resolve(CaminhosDados.arquivoCadastroProprietariosCsv));
            }
            boolean arquivoProprietarioExiste = Files.exists(caminhoDoProprietario);

            //verificado se a pasta com o nome do proprietario existe
            if(Files.notExists(caminhoDoProprietario)){
                //criando a pasta com o nome do proprietario e os arquivos dentro da pasta do proprietario
                Files.createDirectories(caminhoDoProprietario);
                Files.createFile(caminhoDoProprietario.resolve(CaminhosDados.arquivoClienteCsv));
                Files.createFile(caminhoDoProprietario.resolve(CaminhosDados.arquivoProduto));
                Files.createFile(caminhoDoProprietario.resolve(CaminhosDados.arquivoVendasCsv));
            }

            //escrevendo a primeira linha do arquivo cliente dentro da pasta do proprietario
            try (BufferedWriter escrever = Files.newBufferedWriter(
                                                                    caminhoDoProprietario.resolve(CaminhosDados.arquivoClienteCsv),
                                                                    StandardCharsets.UTF_8,
                                                                    StandardOpenOption.APPEND)){
                if (!arquivoProprietarioExiste) {
                    escrever.write("Código Cliente;Nome do Cliente;Número do Celular");
                }
            }
            catch (DominiDeExceptions | IOException e){
                throw new RuntimeException("Erro ao escrever a primeira linha do arquivo cliente: "+ e.getMessage() + e.getStackTrace());
            }

            //escrevendo a primeira linha do arquivo produto dentro da pasta do proprietario
            try (BufferedWriter escrever = Files.newBufferedWriter(
                                                                    caminhoDoProprietario.resolve(CaminhosDados.arquivoProduto),
                                                                    StandardCharsets.UTF_8,
                                                                    StandardOpenOption.APPEND)){
                if (!arquivoProprietarioExiste) {
                escrever.write("Data de Validade;Código De Barra;Nome do Produto;Preço De Venda;Quantidade Pacotes Entrada;Preço Da Compra");
                }
            }
            catch (DominiDeExceptions | IOException e){
                throw new RuntimeException("Erro ao escrever a primeira linha do arquivo cliente: "+ e.getMessage() + e.getStackTrace());
            }

            //escrevendo a primeira linha do arquivo vendas dentro da pasta do proprietario
            try (BufferedWriter escrever = Files.newBufferedWriter(
                                                                    caminhoDoProprietario.resolve(CaminhosDados.arquivoVendasCsv),
                                                                    StandardCharsets.UTF_8,
                                                                    StandardOpenOption.APPEND)){
                if (!arquivoProprietarioExiste) {
                escrever.write("Código De Barra;Nome do Produto;Preço De Venda;Quantidade Vendida");
                }
            }
            catch (DominiDeExceptions | IOException e){
                throw new RuntimeException("Erro ao escrever a primeira linha do arquivo cliente: "+ e.getMessage() + e.getStackTrace());
            }


            //verificando se o arquivo.csv já foi criado
            boolean arquivoExiste = Files.exists(CaminhosDados.caminho.resolve(CaminhosDados.arquivoCadastroProprietariosCsv));

            //abrindo a configuração para escrever no arquivo.csv
            try (BufferedWriter escrever = Files.newBufferedWriter(
                                                                    CaminhosDados.caminho.resolve(CaminhosDados.arquivoCadastroProprietariosCsv),//mostrando o caminho para o arquivo.csv
                                                                    StandardCharsets.UTF_8,//habilitando os caracteres especiais
                                                                    StandardOpenOption.CREATE,//criando o arquivo.csv se não existir
                                                                    StandardOpenOption.APPEND)){//escrevendo no final da linha do arquivo

                //verificando se o arquivo foi criado agora para colocar o cabeçalho
                if(!arquivoExiste){
                    escrever.write("Nome;CPF;Nome da Loja;Endereço da Loja;Senha");
                    escrever.newLine();
                }

                //formando o objeto Proprietário em uma linha de string e separando cada atributos com (;)
                //Para inserir no arquivo.csv nas colunas certas
                String linhaProprietario = String.join(";",
                        proprietario.getNomeProprietario(),
                        String.valueOf(proprietario.getCpf()),
                        proprietario.getNomeDaLoja(),
                        proprietario.getEnderecoDaLoja(),
                        String.valueOf(proprietario.getSenha()));

                //escrevendo uma linha do arquivo.csv
                escrever.write(linhaProprietario);

                //após a finalização da escrita pular para próxima linha
                escrever.newLine();

            }

        } //agrupando exceção do java com a exceção personalizada
        catch (DominiDeExceptions | IOException e) {
            throw new RuntimeException("Erro ao cadastra o proprietário no sistema");
        }*/
    }

    @Override
    public void acessarMercado() {

    }
}
