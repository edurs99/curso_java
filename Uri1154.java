import java.util.Scanner;

public class Uri1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade, contIdades = 0;
        double soma=0;

        while (true){
            idade = teclado.nextInt();
            if (idade < 0){
                break;
            }
            soma = soma + idade;
            contIdades++;
        }

        System.out.printf("%.2f%n", soma/contIdades);
    }
}
