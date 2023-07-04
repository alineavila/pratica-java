package oo.composicao.polimorfismo;

public class Jantar {

    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz i1 = new Arroz(0.2);
        Feijao i2 = new Feijao(0.1);

//      Comida i3 =  new Comida(0.3); // comida genérica ,quando é uma classe abstrata não pode ser instaciada

        Comida i3 = new Feijao(0.1); // a instância é de feijão

        System.out.println(convidado.getPeso());

        convidado.comer(i1);
        convidado.comer(i2);
        convidado.comer(i3);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
