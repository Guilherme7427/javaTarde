package Exemplo;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você deseja fazer um contador?");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
        System.out.println("Òtimo, vamos iniciar um contador!");
            for (int n=0; n<5   ; n++) {
                System.out.println("Contador: " +n);
            }

        }else if (resposta.equalsIgnoreCase("não")) {
            System.out.println("Não vamos fazer o contador!");

        } else {
            System.out.println("Comando não correspondido!");
        }
    }
}