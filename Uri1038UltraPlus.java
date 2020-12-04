import java.util.Scanner;
public class Uri1038UltraPlus{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double total = 0;

        do {
            System.out.println("Por favor, digite o codigo do produto");
            codigo = teclado.nextInt();
            switch(codigo){
                case 0:
                    System.out.println("Segue o total do seu pedido");
                    System.out.printf("R$ %.2f%n", total);
                    break;
                case 1:
                    System.out.println("Adicionando Cachorro quente ao pedido ");
                    total = total + 4.0;
                    break;
                case 2:
                    System.out.println("Adicionando X-Salada ao pedido");
                    total = total + 4.50;
                    break;
                case 3:
                    System.out.println("Adicionando X-Bacon ao pedido");
                    total += 5.0;
                    break;
                case 4:
                    System.out.println("Adicionando Torrada Simples ao pedido");
                    total += 2.0;
                    break;
                case 5:
                    System.out.println("Adicionando Refrigerante ao pedido");
                    total += 1.50;
                    break;
                default:
                    System.out.println(" --- DIGITE UMA OPÇÃO VÁLIDA OU 0 PARA ENCERRAR");
            }

        } while (codigo != 0);



    }
}
