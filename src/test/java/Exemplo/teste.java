package Exemplo;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga sua idade para entrar na festa");
        int numero = scanner.nextInt();
        int idade = numero;
        if (idade >= 18) {
            System.out.println("Você pode entrar!");
        } else {
            System.out.println("Você não pode entrar!");
        }
    }
}
