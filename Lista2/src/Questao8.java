import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro:");
        int a = s.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        int b = s.nextInt();

        System.out.println("Digite o terceiro valor inteiro:");
        int c = s.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Os valores devem ser diferentes.");
            return;
        }

        int maior, medio, menor;

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            maior = b;
            if (a > c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a > b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        System.out.println("Os valores em ordem decrescente são:");
        System.out.println(maior);
        System.out.println(medio);
        System.out.println(menor);
    }
}



