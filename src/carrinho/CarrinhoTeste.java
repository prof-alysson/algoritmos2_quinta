package src.carrinho;


public class CarrinhoTeste {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Cliente cliente = new Cliente();
        cliente.setNome("Mateus");

        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setPreco(100.15);

        Produto outroProduto = new Produto();
        outroProduto.setNome("Mouse");
        outroProduto.setPreco(80.0);

        carrinho.setDono(cliente);
        //ou cliente.setCarrinho(carrinho);
        carrinho.adicionarProduto(produto, 1);
        carrinho.adicionarProduto(outroProduto, 2);

        System.out.printf("Total do carrinho: ", carrinho.getTotal());

        carrinho.removerProduto(outroProduto, 1);
        System.out.printf("Ñovo total: ", carrinho.getTotal());
    }
}
