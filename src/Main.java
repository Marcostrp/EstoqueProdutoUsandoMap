//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.exibirProduto();

        estoqueProduto.adicionarProduto(1L, "Produto 1", 10, 6);
        estoqueProduto.adicionarProduto(3L, "Produto 2", 12, 5);
        estoqueProduto.adicionarProduto(2L, "Produto 3", 5, 12);
        estoqueProduto.adicionarProduto(4L, "Produto 4", 10, 2);

        estoqueProduto.exibirProduto();

        System.out.println("O valor total do estoque é de R$: "+estoqueProduto.valorTotalEstoque());
        System.out.println("O produto mais caro é o " + estoqueProduto.obterProdutoMaisCaro());

    }
}