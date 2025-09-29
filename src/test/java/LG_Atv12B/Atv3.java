package LG_Atv12B;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você quer saber a area de um circulo?");
        String resposta = sc.nextLine();
        if (resposta.equals("sim")) {
            System.out.println("Digite o raio do circulo");
            double raio = sc.nextInt();
            System.out.println("O raio do circulo é: "+(raio*3.14159));
        }else{
            System.out.println("Não vamos calcular a area ");
        }
    }
}
