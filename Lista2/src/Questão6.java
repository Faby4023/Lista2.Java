import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor1 boleano (true/false): ");
        boolean valor1 = s.nextBoolean();

        System.out.print("Digite o valor2 boleano(true/false): ");
        boolean valor2 = s.nextBoolean();

        if (valor1 && valor2) {
            System.out.print("Os dois são verdadeiros ");

        }   else if (!valor1 && !valor2) {
            System.out.print("Os dois são falsos ");
        }
        else{
            System.out.print("Um valor é VERDADEIRO e o outro é FALSO.");


        }
    }
}
