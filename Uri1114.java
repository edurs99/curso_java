import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        valor = teclado.nextInt();
        
        while ( valor != 2002 ){
            System.out.println("Senha Invalida");
            valor = teclado.nextInt();    
        }  
        System.out.println("Acesso Permitido");
    }
}