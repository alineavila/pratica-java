package collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
    public static void main(String[] args) {
//        Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>(); // respeita a ordem de inserção diferente do acima
        // o nome do <> é generics e o do operador é diamonds
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Lucas");
        lista.add("Pedro");

        for(String candidato: lista) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); // não aceita primitivos, por isso é Integer
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums) {
            System.out.println(n);
        }
    }
}
