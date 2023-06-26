package oo.composicao;

import java.util.ArrayList;

public class Carro {

    final Motor motor; // nunca vai poder mudar a referencia do motor ou seja o mesmo motor pra outro carro
    ArrayList<Porta> portas = new ArrayList<>(4);

    Carro() {
        this.motor = new Motor(this); // relação bidirecional
    }
    void adicionarPorta(Porta porta) {
        if(portas.size() == 4) {
            return;
        } else {
            this.portas.add(porta);
        }
    }
    void adicionarPorta(int idPorta) {
        if(portas.size() == 4) {
            return;
        } else {
            this.portas.add(new Porta(idPorta));
        }
    }

    void acelerar(){
        for(Porta porta: portas) {
            if (porta.aberta) {
                return;
            }
        }
        if(motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;

        }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;

        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }


}
