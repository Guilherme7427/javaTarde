package Atividades;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        System.out.println("Vamos fazer algumas questões de matematica!");

        //Triangulo retangulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga o valor A");
        double n1 = sc.nextDouble();
        System.out.println("Diga o valor B");
        double n2 = sc.nextDouble();
        System.out.println("Diga o valor C");
        double n3 = sc.nextDouble();
        System.out.println("A area do triangulo retangulo é: "+(n1*n3/2));

       //Raio
        System.out.println("Vamos calcular o raio do circulo");
        System.out.println("A area do circulo é"+(n3*3.14159));

        //trapezio
        System.out.println("Vamos calcular a area do trapezio");
        System.out.println("A area do trapezio é"+(n1+n2+n2*n3/2));

        //quadrado
        System.out.println("Vamos calcular a area do quadrado");
        System.out.println("A area do quadrado é"+(n2*n2));

        //retangulo
        System.out.println("Vamos calcular a area do retangulo");
        System.out.println("A area do retangulo é: "+(n1*n2));

    }
}
