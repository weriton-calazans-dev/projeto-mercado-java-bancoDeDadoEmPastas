package mercado.controller;

import mercado.dao.repository.ProprietarioDAO;
import mercado.model.entities.Proprietario;
import mercado.view.LeituraScanner;

public class ProprietarioController {
    private LeituraScanner leituraScanner;
    private ProprietarioDAO proprietarioDAO;

   public ProprietarioController(){
       this.leituraScanner = new LeituraScanner();
       this.proprietarioDAO = new ProprietarioDAO();
   }

   public void cadastraProprietario(){
       String nome = leituraScanner.leituraNome();
       Integer cpf = leituraScanner.leituraCpf();
       Integer senha = leituraScanner.senha();
       String enderecoDaLoja = leituraScanner.enderecoDaLoja();
       String nomeDaLoja = leituraScanner.nomeDaLoja();
       Proprietario proprietario = new Proprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);
       proprietarioDAO.cadastraProprietario(proprietario);
   }

       public void acessarMercado(){

   }
}
