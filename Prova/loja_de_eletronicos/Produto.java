package loja_de_eletronicos;

public class Produto {
    private String nome;
    private String marca;
    private float preco;
    private int codigoUnico;
    private int quantidadeEstoque;

    public Produto (String nome, String marca, float preco, int codigoUnico, int quantidadeEstoque){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.codigoUnico = codigoUnico;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean alterarPreco (int codigoUnico, float preco){
        if (this.codigoUnico = codigoUnico){
            this.preco = preco;
            return true;
        }
        else {
            return false;
        }
    }

    public void adicionarQuantidadeEstoque(int quantidadeNovosItens){
        this.quantidadeEstoque += quantidadeNovosItens;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMarca(){
        return this.marca;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getCodigoUnico(){
        return this.codigoUnico;
    }

    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
}
