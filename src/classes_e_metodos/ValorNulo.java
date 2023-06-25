package classes_e_metodos;

public class ValorNulo {

    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        String s2 = null;
        System.out.println(s2.concat("?????")); // não pode apontar pro objeto real pois é null

    }
}
