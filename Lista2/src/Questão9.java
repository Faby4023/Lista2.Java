import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o seu sexo (M MASCULINO, F FEMININO): ");
        String sexo = s.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = s.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = s.nextDouble();
        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println(pesoIdeal);
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("%,.2f",pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
            }
        }
    }

