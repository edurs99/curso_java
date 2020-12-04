import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float a, b, c, triangulo, trapezio;
        
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        
        if ((b + c > a) && (a + b > c) && (a + c > b)){
            triangulo = a+b+c;    
            System.out.println("Perimetro = "+ triangulo);
        }
        else {    
            trapezio = ((a+b)*c)/2;
            System.out.println("Area = " +trapezio);
        }
                    
    }
}   