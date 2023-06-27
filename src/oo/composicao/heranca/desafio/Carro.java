package oo.composicao.heranca.desafio;

public class Carro {

    int velocidadeAtual;

    void acelerar(){
        this.velocidadeAtual += 5;
    }
    void frear(){
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
}
