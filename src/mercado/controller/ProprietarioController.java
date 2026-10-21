package mercado.controller;

import mercado.dao.repository.ProprietarioDAO;
import mercado.model.entities.Proprietario;

public class ProprietarioController implements InterProprietarioController{

    private ProprietarioDAO proprietarioDAO;

   public ProprietarioController(){

       this.proprietarioDAO = new ProprietarioDAO();
   }
   public void cadastraProprietario(Proprietario proprietario){
           proprietarioDAO.cadastraProprietario(proprietario);
   }
    public void acessarMercado(){

   }
}
