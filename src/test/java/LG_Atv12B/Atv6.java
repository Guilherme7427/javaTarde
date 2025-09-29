package LG_Atv12B;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius que você quer converter para Fahrenheit");
        double C = sc.nextDouble();

        double conversao = (C * 9/5)+32;

        System.out.printf("A temperatura em Farhenheit é: %.2f%n", conversao);

    }
}
