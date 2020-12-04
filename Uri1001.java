import java.util.Scanner;

public class Uri1001{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, X;

        // entrada - ler os valores de A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento - somar ambos os valores e armazenar em X
        X = A + B;

        // saida - exibir o valor de X
        System.out.println("X = " + X);
        
    }
}