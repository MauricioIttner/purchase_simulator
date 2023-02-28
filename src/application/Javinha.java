package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria uma lista de produtos disponíveis
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Celular", 1500.0));
        produtos.add(new Produto("Notebook", 3000.0));
        produtos.add(new Produto("Smart TV", 2500.0));

        // Exibe a lista de produtos disponíveis
        System.out.println("Produtos disponíveis:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }

        // Pergunta ao usuário qual produto ele deseja comprar
        System.out.print("\nDigite o nome do produto que deseja comprar: ");
        String nomeProduto = sc.nextLine();

        // Procura o produto na lista de produtos disponíveis
        Produto produtoEscolhido = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoEscolhido = produto;
                break;
            }
        }

        // Se o produto não for encontrado, exibe uma mensagem de erro
        if (produtoEscolhido == null) {
            System.out.println("\nProduto não encontrado.");
        } else {
            // Pergunta ao usuário a quantidade de produtos que ele deseja comprar
            System.out.print("Digite a quantidade de " + produtoEscolhido.getNome() + " que deseja comprar: ");
            int quantidade = sc.nextInt();

            // Calcula o preço total da compra
            double precoTotal = produtoEscolhido.getPreco() * quantidade;

            // Exibe um resumo da compra
            System.out.println("\nResumo da compra:");
            System.out.println("Produto: " + produtoEscolhido.getNome());
            System.out.println("Preço unitário: R$ " + produtoEscolhido.getPreco());
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço total: R$ " + precoTotal);
            
            sc.close();
        }
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
