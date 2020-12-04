import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        valor = teclado.nextInt();
        for (int cont=1; cont<=valor; cont=cont+1){
            System.out.println(cont + " " + (cont*cont) + " " + (cont*cont*cont)) ;
        }
    }
}