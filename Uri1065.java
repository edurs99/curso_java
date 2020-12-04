import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor;
        int qtdePares=0;
        int qtdeImpares=0;
        int qtdePositivos=0;
        int qtdeNegativos=0;
        
        for (int cont=1; cont<=5; cont++){
            valor = teclado.nextFloat();
            if (valor % 2 == 0 && valor > 0){
                qtdePares++;
                qtdePositivos++;
            }
            else if (valor % 2 == 0 && valor < 0){
                qtdePares++;
                qtdeNegativos++;
            }
            else if (valor % 2 != 0 && valor > 0){
                qtdeImpares++;
                qtdePositivos++;
            }
            else if (valor % 2 != 0 && valor < 0){
                qtdeImpares++;
                qtdeNegativos++;
            }
            else { 
                qtdePares++;
            }
        }
        System.out.println(qtdePares +" valor(es) par(es)");
        System.out.println(qtdeImpares +" valor(es) impar(es)");
        System.out.println(qtdePositivos +" valor(es) positivo(s)");
        System.out.println(qtdeNegativos +" valor(es) negativo(s)");
        
    }
}