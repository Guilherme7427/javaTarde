package Atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        System.out.println("Vamos saber a diferença dos numeros!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo numero");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero");
        int n3 = sc.nextInt();
        System.out.println("Digite o quarto numero");
        int n4 = sc.nextInt();
        System.out.println("A diferença dos valores são:"+(n1*n2-n3*n4));
    }
}
