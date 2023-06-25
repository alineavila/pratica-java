package arrays;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdNotas;
        double total = 0;

        System.out.println("Quantas notas gostaria de gravar? ");
        qtdNotas = entrada.nextInt();

        double[] notas  = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Digita a nota "+(i+1)+": ");
            notas[i] = entrada.nextDouble();
        }

        for (double nota : notas) {
            total += nota;
        }

        System.out.println("A média é "+ total/notas.length);

        entrada.close();
    }
}
