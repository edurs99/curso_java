import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        int alcool;
        int diesel;
        int gasolina;
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        do {

            codigo = teclado.nextInt();
            
            switch(codigo){
                case 1:
                    alcool = alcool + 1;
                    break;
                case 2:
                    gasolina = gasolina + 1;
                    break;
                case 3:
                    diesel = diesel + 1;
                    break;
            }
        } while (codigo != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
    }
}
//falta 1142, 1143, 1144, 1154,