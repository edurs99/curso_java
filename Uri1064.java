import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor, somavalor, media;
        int qtdePositivos=0;
        media = 0;
        qtdePositivos = 0;
        somavalor = 0;
        for (int cont=1; cont<=6; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                // System.out.println("Valor positivo");
                qtdePositivos++;
                somavalor = somavalor + valor;
            }
        }
        System.out.println(qtdePositivos +" valores positivos");
        media = somavalor/qtdePositivos;
        System.out.printf("%.1f%n", media);
    }
}