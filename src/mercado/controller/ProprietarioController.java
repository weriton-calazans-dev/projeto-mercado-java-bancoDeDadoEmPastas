package mercado.controller;

import mercado.dao.repository.ProprietarioDAO;
import mercado.model.entities.Proprietario;

public class ProprietarioController {

    private ProprietarioDAO proprietarioDAO;

   public ProprietarioController(){

       this.proprietarioDAO = new ProprietarioDAO();
   }

   public Boolean cadastraProprietario(Integer cpf,String enderecoDaLoja,String nomeDaLoja,String nome,Integer senha){
       try {

           Proprietario proprietario = new Proprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);
           proprietarioDAO.cadastraProprietario(proprietario);
           return true;

       } catch (Exception e) {

           return false;

       }

   }

       public void acessarMercado(){

   }
}
