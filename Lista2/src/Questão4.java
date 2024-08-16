import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = s.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = s.nextInt();

        if (A == B){
            int soma = A + B;
            int C = soma;

            System.out.println("O valor da soma é: " + C);

        }else{
            int C = A * B;
            System.out.println("O valor de C é: " + C);



        }

    }
}
