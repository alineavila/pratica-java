package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.estaLigado());

        c.ligar();
        System.out.println(c.estaLigado());
        System.out.println(c.motor.giros());

        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();

        System.out.println(c.motor.giros());

        c.frear();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        c.frear();

        // FALTOU ENCAPSULAMENTO
        // A classe é sempre a responsável pela segurança dos seus atributos
        //c.motor.fatorInjecao = -30;

        System.out.println(c.motor.giros());

        //  RELAÇÃO BIDIRECIONAL UM MOTOR TEM UM CARRO E UM CARO TEM UM MOTOR
        System.out.println(c.motor.carro.motor.carro.motor.giros());

    }
}
