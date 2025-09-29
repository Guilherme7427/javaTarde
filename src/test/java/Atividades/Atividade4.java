package Atividades;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        System.out.println("Para descobrir suas informações como duncionario precisamos de algumas informações");
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga o seu numero de funcionario");
        double n1 = sc.nextDouble();
        System.out.println("Diga o seu numero de horas trabalhadas");
        double n2 = sc.nextDouble();
        System.out.println("Diga quanto você gaha por hora");
        double n3 = sc.nextDouble();
        System.out.println("NUMERO: "+n1);
        System.out.println("SALARIO: "+(n2*n3));

    }
}
