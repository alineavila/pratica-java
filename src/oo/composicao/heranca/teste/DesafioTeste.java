package oo.composicao.heranca.teste;

import oo.composicao.heranca.desafio.Carro;
import oo.composicao.heranca.desafio.Celta;
import oo.composicao.heranca.desafio.Civic;

public class DesafioTeste {
    public static void main(String[] args) {
        Carro celtinha = new Celta(120);
        Carro newCivic = new Civic(250);

        celtinha.acelerar();
        celtinha.acelerar();

        newCivic.acelerar();
        newCivic.acelerar();

        System.out.println("Velocidade do celtinha => " + celtinha.velocidadeAtual);
        System.out.println("Velocidade do New Civic => " + newCivic.velocidadeAtual);


        celtinha.frear();
        celtinha.frear();
        celtinha.frear();
        celtinha.frear();
        celtinha.frear();
        celtinha.frear();
        celtinha.frear();

        System.out.println("Velocidade do celtinha => " + celtinha.velocidadeAtual);
    }
}
