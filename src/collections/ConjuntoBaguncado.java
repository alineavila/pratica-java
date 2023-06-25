package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean etc..
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());
        conjunto.add("Teste");
        System.out.println("Tamanho é: " + conjunto.size()); // não aceita repetição

        System.out.println(conjunto.remove('x'));
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet(); // define a interface e atribui um obj do tipo hash
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // união de conjuntos, note que nao incluiu os iguais

        System.out.println(conjunto);

        conjunto.retainAll(nums); // intersecção
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
