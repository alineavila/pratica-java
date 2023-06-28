package oo.composicao.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    Carro(int velocidadeMaxima) {

        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if(VELOCIDADE_MAXIMA + delta > VELOCIDADE_MAXIMA) {
            this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += delta;

        }
    }
    void frear(){
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
}
