import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, velocidade;
        double qtdLitros;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        qtdLitros = (double)tempo * velocidade / 12;

        System.out.printf("%.3f%n",qtdLitros);
    }
}