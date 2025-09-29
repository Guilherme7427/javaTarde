package Atividades;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga o raio do circulo");
        double raio = sc.nextDouble();
        System.out.printf("A area do circulo é: "+(raio*raio*3.14159));
    }
}
