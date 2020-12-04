import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x,y;
        
        x = teclado.nextInt();
        y = teclado.nextInt();

        while ( x != 0 && y !=0 ){
            if (x > 0 && y > 0){
                System.out.println("primeiro");
                x = teclado.nextInt();
                y = teclado.nextInt();
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
                x = teclado.nextInt();
                y = teclado.nextInt();
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
                x = teclado.nextInt();
                y = teclado.nextInt();
            } 
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
                x = teclado.nextInt();
                y = teclado.nextInt();
            }
             
        }
    
    }
}