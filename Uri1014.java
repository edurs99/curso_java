
import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int dist;
        float consumo, media;


        dist    = teclado.nextInt();
        consumo = teclado.nextFloat();

        media   = dist / consumo;

        System.out.printf("%.3f km/l%n", media);
    }
}