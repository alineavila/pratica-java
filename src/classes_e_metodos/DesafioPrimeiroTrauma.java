package classes_e_metodos;


/*
Corrigir o código
public class DesafioPrimeiroTrauma {
        int a = 3;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
* */
public class DesafioPrimeiroTrauma {
    int a = 3;
    /* quando a variável não é static,
    significa que é um atributo de instancia.
    Então para resolver ou botamos a variável
    com a anotação static ou criamos uma instancia da classe.
     */


    public static void main(String[] args) {
        DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
        System.out.println(p.a);
    }
}
