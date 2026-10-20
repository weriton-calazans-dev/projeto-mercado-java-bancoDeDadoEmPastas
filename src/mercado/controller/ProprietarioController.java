package mercado.controller;

import mercado.dao.repository.ProprietarioDAO;
import mercado.model.entities.Proprietario;

public class ProprietarioController {

    private ProprietarioDAO proprietarioDAO;

   public ProprietarioController(){

       this.proprietarioDAO = new ProprietarioDAO();
   }

   public Proprietario cadastraProprietario(String cpf,String enderecoDaLoja,String nomeDaLoja,String nome,String senha){

       try {

           Proprietario proprietario = new Proprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);

           proprietarioDAO.cadastraProprietario(proprietario);

           return proprietario;


       } catch (Exception e) {

           throw new RuntimeException("Falha ao salvar o proprietário no banco de dados. "+ e.getStackTrace());

       }

   }

       public void acessarMercado(){

   }
}
