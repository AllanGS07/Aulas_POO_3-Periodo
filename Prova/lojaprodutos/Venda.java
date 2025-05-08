package lojaprodutos;

public class Venda {
    private Produto produto;
    private int quantidadeProduto;
    private float valorVenda;

    public Venda(Produto produto, int quantidadeProduto) {
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
        this.produto.removerProdutosEstoque(quantidadeProduto);
        this.valorVenda = quantidadeProduto * produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

}
