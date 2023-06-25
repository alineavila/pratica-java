package classes_e_metodos.desafio_modulo;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("feijão", 0.15);
        Comida c2 = new Comida("arroz", 0.5);
        Comida c3 = new Comida("bife", 0.85);

        Pessoa p1 = new Pessoa("Elton", 100);

        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);

        p1.imprimirPeso();
    }
}
