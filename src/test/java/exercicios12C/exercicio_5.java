package exercicios12C;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado");
        int n1 = sc.nextInt();

        int lado = n1*n1;
        int perimetro = 4*n1;

        System.out.println("O comprimento do lado do quadrado é: "+lado);
        System.out.println("O perimetro do quadrado é: "+perimetro);
    }
}
