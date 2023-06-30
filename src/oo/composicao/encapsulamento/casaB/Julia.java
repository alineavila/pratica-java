package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();
    void testeAcessos(){
//        System.out.println(esposa.segredo);  NÃO CONSEGUE ACESSAR PQ É PRIVADO
//        System.out.println(sogra.facoDentroDeCasa);
//        System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem); // não herda e nem está no mesmo pacote por isso so vê oq é publico

    }
}
