package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> f1 = new LinkedList<>();
        f1.add("Ana");
        f1.offer("Bia");
        f1.offer("Bia");
        f1.offer("Carlos");
        f1.offer("Daniela");
        f1.offer("Gui");
        // ambos adicionam, porem existem listas que tem restriçoes de tamanho e caso não consiga adicionar
        // o offer retorna false, ja o add lança um erro

        // pega o proximo elemento da fila mas não remove
        System.out.println(f1.peek()); //  se a lista estiver vazia retorna null
        System.out.println(f1.peek());
        System.out.println(f1.element()); //  se a lista estiver vazia retorna uma exceção (erro)
        System.out.println(f1.element());


        // Obtem o proximo elemento da fila e remove
        System.out.println(f1.poll()); // quando ta vazio retorna false
        System.out.println(f1.remove()); //  quando ta vazio lança uma exceção


        f1.size();
        f1.clear();
        f1.isEmpty();
        f1.contains("..");




    }

}
