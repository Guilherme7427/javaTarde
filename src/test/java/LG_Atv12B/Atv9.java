package LG_Atv12B;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade para converter em meses");
        int idade = sc.nextInt();
        System.out.println("A sua idade em meses é: "+(idade/12));
    }
}
