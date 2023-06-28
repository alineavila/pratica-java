package comparable_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = getLista();
        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

    }
    private static List<String> getLista() {
        return Arrays.asList("camiseta", "meia", "luva", "agasalho");
    }
}
