import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );

        System.out.println("Digite o valor de A: ");
        int valorA = s.nextInt();

        System.out.println("Digite o valor de B: ");
        int valorB = s.nextInt();

        System.out.println("Digite o valor de C: ");
        int valorC = s.nextInt();

        int soma = valorA + valorB;
                if (soma < valorC){
                    System.out.println("A soma é menor: ");
                }else {
                    System.out.println("A soma A+B é maior que o valorC: ");

                }


    }
}