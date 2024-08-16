import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Questão3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = s.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");


        }
    }
}