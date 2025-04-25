import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //atributo
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProduto() {
        this.estoqueProduto = new HashMap<>();
    }
    public void adicionarProduto(Long cod, String nome, int qtd, double preco){
        estoqueProduto.put(cod, new Produto(nome, preco, qtd));
    }
    public void exibirProduto(){
        System.out.println(estoqueProduto);
    }
    public double valorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                valorTotalEstoque += p.getQtd() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro (){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProduto.isEmpty()){
            for (Produto p : estoqueProduto.values()){
                if( p.getPreco() > maiorPreco ){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
