import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor,numero;
        
        valor = teclado.nextInt();
        for (int cont=1; cont<=valor; cont=cont+1){
            numero = teclado.nextInt();
            if (numero > 0 && numero % 2 == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (numero < 0 && numero % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if (numero > 0 && numero % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } 
            else if (numero < 0 && numero % 2 != 0) {
                    System.out.println("ODD NEGATIVE");
            }
            else {
            System.out.println("NULL");  
            } 
        }

    }
}