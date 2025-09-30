package exercicios12C;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int  n1 = sc.nextInt();

        int dias = n1*365;

        System.out.print("Você viveu "+dias);
        System.out.print(" dias");

    }
}
