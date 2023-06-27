package oo.composicao.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Jogador heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;


        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " +heroi.vida);


    }
}
