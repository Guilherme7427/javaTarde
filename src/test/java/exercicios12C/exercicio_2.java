package exercicios12C;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas horas você quer converter");
        double n1 = sc.nextDouble();

        double minutos = n1*64;

        System.out.print("As horas convertidas ficaram em"+minutos);
        System.out.println(" minutos");
    }
}
