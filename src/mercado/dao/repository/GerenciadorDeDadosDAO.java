package mercado.dao.repository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GerenciadorDeDadosDAO implements InterGerenciadorDeDadosDAO {

    public Boolean verificadorCaminhoExiste(Path caminho){
        return Files.exists(caminho);
    }

    public Boolean verificadorCaminhoNaoExiste(Path caminho){
        return Files.notExists(caminho);
    }

    public Boolean criarPasta(Path caminho){
        try {
            Files.createDirectories(caminho);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar pastas. ");
        }
    }

    public Boolean criarArquivoCsv(Path caminho){
        try {
            Files.createFile(caminho);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar arquivo.csv. ");
        }
    }

    public void escritaDaPrimeiraLinha(Boolean caminho, String primeiraLinha,Path caminhoArquivo){
        if(caminho){
            try {
                Files.writeString(caminhoArquivo,primeiraLinha,StandardCharsets.UTF_8,StandardOpenOption.APPEND);
                System.lineSeparator();
            } catch (IOException e) {
                throw new RuntimeException("Erro ao escrever a primeira linha do arquivo. ");
            }
        }
    }

    public Boolean escreverArquivoCsv(String linhaDaEscrita,Path caminho){
        try {
            Files.writeString(caminho,linhaDaEscrita, StandardCharsets.UTF_8, StandardOpenOption.APPEND,StandardOpenOption.CREATE);
            //Pulando para próxima linha do arquivo
            System.lineSeparator();
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever arquivo. ");
        }
    }




    //salvar na tabela csv

    //buscar na tabela csv

    //listar todos os produtos

    //atualizar produtos

    //deletar produtos
}
