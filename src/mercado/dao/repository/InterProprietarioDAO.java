package mercado.dao.repository;

import mercado.model.entities.Proprietario;

public interface InterProprietarioDAO {
    public void cadastraProprietario(Proprietario proprietario);
    public void acessarMercado();
}
