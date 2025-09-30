package exercicios12C;

import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base maior do trapezio");
        double n1 = sc.nextDouble();
        System.out.println("Digite a base menor do trapezio");
        double n2 = sc.nextDouble();
        System.out.println("Digite a altura do trapezio");
        double n3 = sc.nextDouble();

        System.out.println("A area do trapezio é de: "+(n2*n1)*n3/2);

    }
}
