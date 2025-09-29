package Atividades;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular o valor total da sua compra");
        System.out.println("Quantas peças de carro você vai comprar?");
        int peca1 = sc.nextInt();
        System.out.println("Qual o valor das peças de carro você vai comprar?");
        double valor1 = sc.nextDouble();
        System.out.println("Quantas peças de moto você vai levar?");
        int peca2 = sc.nextInt();
        System.out.println("Qual o valor das peças de moto?");
        double valor2 = sc.nextDouble();

        double resultado1 = (peca1*valor1);
        double resultado2 = (peca2*valor2);

        System.out.println("O valor total das peças de carro:"+resultado1);
        System.out.println("O valor total das peças de moto:"+resultado2);
        System.out.println("O valor total da sua compra é:"+(resultado1+resultado2));
    }
}
