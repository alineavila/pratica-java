package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> listaDeCompras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        listaDeCompras.add(compra);
    }


    double obterValorTotal(){
        double total = 0;
        for (Compra compra: listaDeCompras) {
            for(Item item: compra.listaDeItens) {
                total += (item.quantidade * item.produto.preco);
            }
        }
        return total;
    }


}
