package oo.composicao.heranca;

public class Heroi extends Jogador{

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente); // super chama o metodo da superclasse
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;

    }
}
