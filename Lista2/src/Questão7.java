import java.util.Scanner;
public class Questão7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = s.nextInt();

        int resultado;

        if (numero % 2 == 0) {

            resultado = numero + 5;
        } else {
            resultado = numero + 8;
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}
