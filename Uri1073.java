import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, elevado;
        
        valor = teclado.nextInt();
            for (int cont=2; cont<=valor; cont=cont+2){
                elevado = cont * cont;
                System.out.println(cont + "^2 = " + elevado);    
            }

    }
}