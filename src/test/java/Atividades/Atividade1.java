package Atividades;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Vamos fazer algumas contas!");
        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo numero");
        int n2 = sc.nextInt();
        System.out.println("A soma dos seus numeros é: "+(n1+n2));
    }
}
