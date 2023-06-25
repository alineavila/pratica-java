package collections;

import java.util.ArrayDeque;
import java.util.Deque;

// last in first out
public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        // ambos adicionam mas difere quando atinge a capacidade máxima
        livros.add("Java Efetivo");  // retorna false quando atingiu o máximo
        livros.push("Clean Code"); // lança uma exceção quando atinge o máximo

        // retornam o próximo elemento mas não removem
        System.out.println(livros.peek()); // retorna null se n tem elemento
        System.out.println(livros.element()); // lança exceção se não tem elemento

        // retorna e remove o proximo elemento
        System.out.println(livros.poll()); // false se nao tem elemento
        System.out.println(livros.remove()); // lança exceção se não tem elemento
        System.out.println(livros.pop()); // lança exceção se n tem elemento

        livros.size();
        livros.clear();
        livros.contains("..");
        livros.isEmpty();
    }

}
