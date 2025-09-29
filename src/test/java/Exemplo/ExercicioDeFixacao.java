package Exemplo;

public class ExercicioDeFixacao {
    public static void main(String[] args) {
        String product1="computer";
        String product2="office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1= 2100.0;
        double price2= 650.50;
        double measure= 53.234567;

        System.out.println("products:");
        System.out.printf("%s, which price is  $ %.2f%n ",product1,price1);
        System.out.printf("%s, which price is  $ %.2f%n",product2, price2);
        System.out.printf("record: %d yers old, code %d and gender: %c%n",age,code,gender);
        System.out.printf("Measue whith eigth decimal places: %.8f%n",measure);
        System.out.printf("Rouded (three decimal places): %.3f%n",measure);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
