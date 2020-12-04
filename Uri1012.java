import java.util.Scanner;
public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, AREA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        AREA = (A*C)/2;
        System.out.printf("TRIANGULO: %.3f%n",AREA);
        AREA = 3.14159 * C * C;  // C ^ 2
        System.out.printf("CIRCULO: %.3f%n",AREA);
        AREA = (A + B)*C/2;
        System.out.printf("TRAPEZIO: %.3f%n",AREA);
        AREA = B * B;
        System.out.printf("QUADRADO: %.3f%n",AREA);
        AREA = A * B;
        System.out.printf("RETANGULo: %.3f%n",AREA);


    }
}