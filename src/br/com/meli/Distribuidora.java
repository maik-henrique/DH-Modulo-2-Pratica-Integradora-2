package br.com.meli;

import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {
        Produto bolinhaDeGuolfe = new Produto("Bolinha de Guolfe", 12.2d);
        Produto mouse = new Produto("Mouse", 434.23d);
        NaoPereciveis arroz = new NaoPereciveis("Arroz", 5.33d, "Grão");
        NaoPereciveis feijao = new NaoPereciveis("Feijão", 5.33d, "Grão");
        Pereciveis picanha = new Pereciveis("Picanha", 22.25d, 4);
        Pereciveis leite = new Pereciveis("Leite", 10.22d, 1);

        List<Produto> produtos = List.of(bolinhaDeGuolfe, mouse, arroz, feijao, picanha, leite, mouse);

        produtos.forEach(produto -> {
            int quantidade = (int) (Math.random() * 5);
            double preco  = produto.calcular(quantidade);
            System.out.printf("Preço: %f - Quantidade: %d - Produto: %s\n", preco, quantidade, produto.toString());
        });

    }
}
