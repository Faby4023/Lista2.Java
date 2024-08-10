import java.util.Objects;
import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.println("Digite seu sexo:  ");
        String sexo = s.nextLine();

        System.out.println("Digite seu estado civil: ");
        String estado = s.nextLine();

        String casado = s.toString();

        if (sexo.equalsIgnoreCase("F") && estado.equalsIgnoreCase("CASADA")) {
            System.out.print("Quantos anos de casada: ");
            int anosDeCasados = s.nextInt();
            System.out.println(nome + ", você está casada há " + anosDeCasados + " anos.");

        }else{
            System.out.print("Suas informações foram registradas!");
        }

    }
}