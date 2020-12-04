import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float cod;
        
        cod = teclado.nextFloat();
        
        if ((cod >= 0) && (cod <= 25)){    
            System.out.println("Intervalo [0,25]");
        }
        else if ((cod > 25 ) && (cod <= 50)){    
            System.out.println("Intervalo (25,50]");
        }
        else if ((cod > 50) && (cod <= 75)){    
            System.out.println("Intervalo (50,75]");
        }
        else if ((cod > 75) && (cod <= 100)){    
            System.out.println("Intervalo (75,100]");
        }
        else {    
            System.out.println("Fora de intervalo");
        }
    }
}   