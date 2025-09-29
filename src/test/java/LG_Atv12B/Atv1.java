package LG_Atv12B;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você deseja realizar uma soma?");
        String resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("sim")) {
            System.out.println("Vamos fazer a soma!");


            System.out.println("Digite o primeiro numero");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo numero");
            int n2 = sc.nextInt();

            System.out.println("A soma dos numeros é: " + (n1 + n2));

        }else {
        System.out.println("Não vamos fazer a soma!"); }




    }
}
