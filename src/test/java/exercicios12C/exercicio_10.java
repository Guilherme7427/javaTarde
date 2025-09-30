package exercicios12C;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite  a sua altura");
        double altura = sc.nextDouble();
        double resposta = 72.2*altura-58;
        System.out.println("O seu peso ideal é: "+resposta);
    }
}
