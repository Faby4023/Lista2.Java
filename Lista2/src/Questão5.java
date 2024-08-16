import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = s.nextDouble();

        if (numero > 0) {
            double resultado = numero * 2;
            System.out.println("O dobro do número é: " + resultado);


        } else {
            double resultado = numero * 3;
            System.out.println("O triplo do número é: " + resultado);


        }
    }
}
