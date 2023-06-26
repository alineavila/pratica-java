package oo.composicao;

import java.util.ArrayList;

// uma compra tem vários itens
public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this; // automaticamente coloca a compra dentro do item relação bidirecional
    }

    double obterValorTotal() {
        double vlrTotal = 0;
        for(Item item: itens) {
            vlrTotal += (item.quantidade * item.preco);
        }
        return vlrTotal;
    }

}
