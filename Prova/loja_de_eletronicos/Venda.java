package loja_de_eletronicos;

public class Venda {
    Produto produto;
    String dataDeVenda;
    int quantidadeProduto;

    public Venda (int codigoUnico, String dataDeVenda, int quantidadeProduto){
        if (produto.getCodigoUnico() == codigoUnico){
            this.dataDeVenda = dataDeVenda;
            this.quantidadeProduto = quantidadeProduto;
        }
    }

    
}
