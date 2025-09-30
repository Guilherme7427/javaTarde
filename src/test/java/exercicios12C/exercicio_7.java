package exercicios12C;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos quilometros você percorreu com o carro");
        double n1 = sc.nextDouble();
        System.out.println("Digite quantos litros foram consumidos");
        double n2 = sc.nextDouble();

        double media = n1/n2;

        System.out.println("O consumo medio é de: "+media);
    }
}
