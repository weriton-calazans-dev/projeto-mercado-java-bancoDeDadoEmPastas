package mercado.dao.repository;

import java.nio.file.Path;

public interface InterGerenciadorDeDadosDAO {
    public Boolean verificadorCaminhoExiste(Path caminho);
    public Boolean verificadorCaminhoNaoExiste(Path caminho);
    public Boolean criarPasta(Path caminho);
    public Boolean criarArquivoCsv(Path caminho);
    public void escritaDaPrimeiraLinha(Boolean caminho, String primeiraLinha,Path caminhoArquivo);
    public Boolean escreverArquivoCsv(String linhaDaEscrita,Path caminho);
}
