package oo.composicao;

public class Carro {

    final Motor motor; // nunca vai poder mudar a referencia do motor ou seja o mesmo motor pra outro carro

    Carro() {
        this.motor = new Motor(this); // relação bidirecional
    }

    void acelerar(){
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
