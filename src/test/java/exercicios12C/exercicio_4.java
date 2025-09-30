package exercicios12C;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        double n2 = sc.nextDouble();
        double poderada = (n1*3+n2*2) / (3+2);
        System.out.println("A media poderana é: "+poderada);
    }
}
