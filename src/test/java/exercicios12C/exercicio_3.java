package exercicios12C;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do produto");
        double preco = sc.nextDouble();

        System.out.println("Deseja adicionar um desconto de 15%?");
        String resposta = sc.nextLine();
        if (resposta.equals("sim"))
        {
            double valor = preco * 0.15;
            System.out.println("O seu produto com desconto ficará R$" + valor);
        }else{
            System.out.println("Você ira pagar sem o desconto!");
        }

    }
}
