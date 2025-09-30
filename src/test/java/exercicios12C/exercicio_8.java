package exercicios12C;

import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double n1 = sc.nextDouble();

        System.out.println("Deseja dividir em 3 parcelas iguais?");

        String resposta = sc.nextLine();
        if (resposta.equals("sim")) {
            System.out.println("O valor do seu produto parcelado é de: R$"+n1/3);
        }else{
            System.out.println("Você não vai parcelar o produto");
            System.out.println("O total da compra sera de: "+n1);
        }
    }
}
