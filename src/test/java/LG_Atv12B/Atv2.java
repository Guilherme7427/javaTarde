package LG_Atv12B;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Deseja saber o dobro de um numero?");

        String resposta = sc.nextLine();
        if (resposta.equals("sim"))
        {
            System.out.println("Digite o numero");
            int n1 = sc.nextInt();
            System.out.println("O dobro do seu numero é: "+(n1*2));

        }else {
            System.out.println("Não vamos dobrar o numero");

        }


    }
}
