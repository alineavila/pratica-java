package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // pelo indice

        for(Usuario u: lista) {
            System.out.println(u); // note que manteve a ordem de inserção e que implicitamente chama o metodo toString
        }

        System.out.println(lista.remove(1)); // retorna o obj que vc excluiu

        System.out.println(lista.remove(new Usuario("Manu"))); // como o equals é so pelo nome ele acha e imprime verdadeiro ou falso

    }
}
