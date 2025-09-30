package exercicios12C;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        double n1 = sc.nextDouble();
        System.out.println("Digite o valor dos juros mansais");
        double n2 = sc.nextDouble();

        double rendimento = n1*(n2/100);
        double total = n1+rendimento;

        System.out.println("O rendimento sera de: "+rendimento);
        System.out.println("O total com os juros sera de: "+rendimento);
    }
}
