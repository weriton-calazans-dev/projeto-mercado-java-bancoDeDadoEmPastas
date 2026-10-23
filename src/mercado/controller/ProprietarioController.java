package mercado.controller;

import mercado.dao.repository.InterGerenciadorDeDadosDAO;
import mercado.dao.repository.InterProprietarioDAO;
import mercado.model.entities.Proprietario;

public class ProprietarioController implements InterProprietarioController{

   private InterProprietarioDAO interProprietarioDAO;

   public ProprietarioController(){
   }

   public ProprietarioController(InterProprietarioDAO interProprietarioDAO){
       this.interProprietarioDAO = interProprietarioDAO;
   }

   public void cadastraProprietario(String cpf,String enderecoDaLoja,String nomeDaLoja,String nome,String senha){
       try {
           Proprietario proprietario = new Proprietario(cpf,enderecoDaLoja,nomeDaLoja,nome,senha);
           interProprietarioDAO.cadastraProprietario(proprietario);
       } catch (RuntimeException e) {
           throw new RuntimeException(e.getMessage());
       }
   }

   public void acessarMercado(){

   }
}
