package lojaprodutos;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Dell G15", "Dell", (float) 4799.99, 1, 100);
        Venda venda = new Venda(produto, 2);

        System.out.println(venda.getValorVenda());
        produto.atualizarPrecoProduto((float) 5000.00);
        System.out.println(produto.getQuantidadeProdutoEstoque());

        Venda venda2 = new Venda(produto, 2);
        System.out.println(venda2.getValorVenda());
        System.out.println(produto.getQuantidadeProdutoEstoque());

        produto.adicionarNovosProdutosEstoque(4);
        System.out.println(produto.getQuantidadeProdutoEstoque());
    }
}
