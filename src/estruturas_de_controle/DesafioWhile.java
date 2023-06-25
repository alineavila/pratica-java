import java.util.Scanner;

public class DesafioWhile {

    /*
    * O usuario digita uma nota valida de 0 a 10
    * armazenar o total de todas as notas
    * anotar a quantidade de notas validas
    * dar a média
    * -1 sair do programa*/

    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);

        Double numeroDigitado = 0.0;
        Double total = 0.0;
        Double media = 0.0;
        Double qtdNotas = 0.0;

        while(numeroDigitado != -1) {
            System.out.print("Digite uma nota ou -1 para sair: ");
            numeroDigitado = Double.parseDouble(entrada.nextLine());
            if(numeroDigitado != -1 && numeroDigitado >= 0 && numeroDigitado <= 10) {
                total = total + numeroDigitado;
                System.out.println(total);
                qtdNotas++;
                System.out.println(qtdNotas);
            } else if (numeroDigitado < -1 || numeroDigitado > 10) {
                System.out.println("A nota deve ser entre 0 e 10");
            }
        }
        media = total/qtdNotas;
        System.out.println("A média é: " + media);


        entrada.close();
    }

}
