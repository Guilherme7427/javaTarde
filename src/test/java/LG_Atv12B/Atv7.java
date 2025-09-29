package LG_Atv12B;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos converter dias em horas");
        System.out.println("Digite quantas dias deseja converter");
        int converter = sc.nextInt();

        double conversao = converter * 24.00;

        System.out.printf("A conversão em horas é: %.2f%n", conversao);
    }
}
