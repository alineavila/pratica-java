package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // adicionou
        usuarios.put(2, "Clara");
        usuarios.put(3, "Mike");
        usuarios.put(1, "Ricardo"); // alterou

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // conjunto de chaves
        System.out.println(usuarios.values()); // conjunto de valores
        System.out.println(usuarios.entrySet()); // chaves e valores

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Clara"));

        System.out.println(usuarios.get(1));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }
        for (String nomeUsuario: usuarios.values()) {
            System.out.println(nomeUsuario);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

        System.out.println(usuarios.remove("Rebeca"));
        System.out.println(usuarios.remove(4));
        System.out.println(usuarios.remove(1,"Roberto"));





    }
}
