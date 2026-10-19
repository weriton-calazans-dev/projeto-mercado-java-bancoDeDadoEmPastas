package mercado.model.entities;

import mercado.model.entities.enumeracao.FomaDePagamento;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import static mercado.util.FormataData.formatarHora;

public class CompraDoCliente {

    private Cliente cadastroDoCliente;
    private FomaDePagamento fomaDePagamento;

    LocalDateTime dataHoraDaCompra = LocalDateTime.now();

    List<Vendas> listaProdutoComprado = new LinkedList<>();

    public CompraDoCliente(Cliente cadastroDoCliente, Vendas produtoComprado) {
        this.cadastroDoCliente = cadastroDoCliente;
        this.listaProdutoComprado.add(produtoComprado);
        String dataCompra = formatarHora.format(dataHoraDaCompra);
    }

    public Cliente getCadastroDoCliente() {
        return cadastroDoCliente;
    }

    public LocalDateTime getDataHoraDaCompra() {
        return dataHoraDaCompra;
    }

    public FomaDePagamento getFomaDePagamento() {
        return fomaDePagamento;
    }

    public void setFomaDePagamento(FomaDePagamento fomaDePagamento) {
        this.fomaDePagamento = fomaDePagamento;
    }

    public void ProdutoComprado(Vendas produto){
        this.listaProdutoComprado.add(produto);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("     Produtos Comprado ");
        sb.append(cadastroDoCliente.getNomeCliente()).append('\n');
        for (Vendas pro: listaProdutoComprado) {
            sb.append(pro.getProduto().getNomeProduto()).append('\n');
            sb.append(pro.getQuantidade()).append('\n');
        }
        return sb.toString();
    }
}
