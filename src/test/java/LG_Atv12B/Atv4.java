package LG_Atv12B;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você deseja saber a area de um triangulo??");
        String resposta = sc.nextLine();

        if (resposta.equals("sim")) {
            System.out.println("Digite a altutura do triangulo");
            double altura = sc.nextDouble();
            System.out.println("Digite a base do triangulo");
            double base = sc.nextDouble();
        }else{
            System.out.println("Não vamos calcular a area");
        }
    }
}
