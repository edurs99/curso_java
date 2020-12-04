import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;                            // valor inicial do saque
        int q100, q50, q20, q10, q5, q2, q1;  // 1 variável para cada qtd de cédula
        int resto;                            // o resto vale como um valor temporário para minhas contas

        // entrada - valor inicial do saque
        valor = teclado.nextInt();

        // processamento - obter cada uma das cédulas fazendo divisões e restos consecutivos
        q100  = valor / 100;     // já obtenho a quantidade de cédulas de R$ 100
          // quanto soubrou?    resto = valor - q100 * 100; 

        q50   = valor % 100 / 50;      // já obtenho a quantidade de cédulas de R$ 50
        q20   = valor % 100 % 50 / 20;
        q10   = valor % 100 % 50 % 20 / 10;
        q5    = valor % 100 % 50 % 20 % 10 / 5;
        q2    = valor % 100 % 50 % 20 % 10 % 5 / 2;
        q1    = valor % 100 % 50 % 20 % 10 % 5 % 2;

        // saída - seguir o padrão do URI
        System.out.println(valor);
        System.out.println(q100 + " nota(s) de R$ 100,00");
        System.out.println(q50  + " nota(s) de R$ 50,00");
        System.out.println(q20  + " nota(s) de R$ 20,00");
        System.out.println(q10  + " nota(s) de R$ 10,00");
        System.out.println(q5   + " nota(s) de R$ 5,00");
        System.out.println(q2   + " nota(s) de R$ 2,00");
        System.out.println(q1   + " nota(s) de R$ 1,00");
    }
}