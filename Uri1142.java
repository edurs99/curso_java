import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int num = 1;
        valor = teclado.nextInt();
        for (int cont=1; cont<=valor; cont=cont+1){
            System.out.println(num + " " + (num+1) + " " + (num+2) + " PUM") ;
                num = num + 4;
        
        }
    }
}