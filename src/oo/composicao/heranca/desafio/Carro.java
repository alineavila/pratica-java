package oo.composicao.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    public int delta = 5;

    protected Carro(int velocidadeMaxima) {

        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(VELOCIDADE_MAXIMA + delta > VELOCIDADE_MAXIMA) {
            this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += delta;

        }
    }
    public void frear(){
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
}
