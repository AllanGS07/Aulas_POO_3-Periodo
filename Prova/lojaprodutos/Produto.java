package lojaprodutos;

public class Produto {
    private String nome;
    private String marca;
    private float preco;
    private int codigoUnico;
    private int quantidadeProdutoEstoque;

    public Produto(String nome, String marca, float preco, int codigoUnico, int quantidadeProdutoEstoque) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.codigoUnico = codigoUnico;
        this.quantidadeProdutoEstoque = quantidadeProdutoEstoque;
    }

    public void atualizarPrecoProduto(float novoPreco){
        this.preco = novoPreco;
    }

    public void adicionarNovosProdutosEstoque(int quantidadeNovaRemessa){
        this.quantidadeProdutoEstoque += quantidadeNovaRemessa;
    }

    public void removerProdutosEstoque(int quantidadeVendida){
        this.quantidadeProdutoEstoque -= quantidadeVendida;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public int getQuantidadeProdutoEstoque() {
        return quantidadeProdutoEstoque;
    }


}
