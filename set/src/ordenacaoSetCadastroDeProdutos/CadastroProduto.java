package ordenacaoSetCadastroDeProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrdenadoPorNome = new TreeSet<>(produtoSet);
        if (!produtoSet.isEmpty()) {
            return produtosOrdenadoPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrdenadoPorPreco = new TreeSet<>(new CompararPorPreco());
        if (!produtoSet.isEmpty()) {
            produtosOrdenadoPorPreco.addAll(produtoSet);
            return produtosOrdenadoPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }





}


