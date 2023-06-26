package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> listaDeItens = new ArrayList<>();

    void adicionarItem(Item item){
        listaDeItens.add(item);
    }
}
