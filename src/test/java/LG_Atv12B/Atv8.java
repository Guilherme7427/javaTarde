package LG_Atv12B;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero inteiro que você quer dividir");
        int n1 = sc.nextInt();
        System.out.println("Digite por quanto você quer dividir");
        int n2 = sc.nextInt();

        double resultado = n1/n2;
        double resto = n1 % n2;
        System.out.printf("O resultado da sua divisão é %f, e o resto da divisão é %.2f%n", resultado, resto);

    }
}
