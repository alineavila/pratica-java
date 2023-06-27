package generics;

public class Teste {
    public static void main(String[] args) {
        MyClass<Integer, Double> ob1 = new MyClass<>(10, 20.33);
        ob1.imprimeTipo();

        // generics limitado:

        Numeros<Double> n1 = new Numeros<>(-3.0);
        Numeros<Integer> n2 = new Numeros<>(3);
        System.out.println(n1.quadrado());
        System.out.println(n1.absIgual(n2));
    }
}
