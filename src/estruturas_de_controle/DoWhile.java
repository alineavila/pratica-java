import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "sair";
        // o do faz o laço pelo menos uma vez
        // note que ele entra no while mesmo o valor sendo sair
        do {
            System.out.println("digite a entrada: ");
            valor = entrada.nextLine();

        } while (!valor.equalsIgnoreCase("sair"));

        entrada.close();
    }
}
