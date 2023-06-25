package collections;

import java.util.HashSet;

/*
* Se o hashCode da classe Usuario não estiver implementado apenas o equals
* a linha 20 teria como resultado false pq no HashMap ele primeiramente varre usando o hashcode e dps usa o equals
* ou seja, se o hashCode falhar ele não vai pro equals
* O HashSet é mto mais rapido em termos de pesquisa exatamente pelo hashcode
* podemos usar qqr coisa como hashcode, inclusive retornar apenas um numero, assim o hashcode é o mesmo
* para todos e ele executa o equals em todos
* a ideia do hashcode é ser um número único
*
* */

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Aline"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Alice"));

        boolean resultado = usuarios.contains(new Usuario("Aline"));
        System.out.println(resultado);


    }
}
