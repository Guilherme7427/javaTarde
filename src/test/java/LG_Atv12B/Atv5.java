package LG_Atv12B;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular o seu salario com os 10% de aumento");
        System.out.println("Digite o seu salario");
        double n1 = sc.nextDouble();

        double aumento = n1 * 0.10;
        double resultado = n1 + aumento;

        System.out.printf("O seu salario com aumento é : R$ %.2f%n", resultado);
    }
}
