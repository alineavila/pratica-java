package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

import java.sql.SQLOutput;

public class Pedro extends Ana {

    void testeAcessos(){

        Ana mae = new Ana();
//        System.out.println(esposa.segredo);  NÃO CONSEGUE ACESSAR PQ É PRIVADO
//        System.out.println(mae.facoDentroDeCasa); É VISIVEL APENAS PARA O MESMO PACOTE (VISIBILIDADE DEFAULT)
//        System.out.println(mae.formaDeFalar); TENHO QUE ACESSAR DIRETAMENTE PELA INSTANCIA DE PEDRO
        System.out.println(formaDeFalar); // transmitido por herança
        System.out.println(todosSabem);

    }
}
