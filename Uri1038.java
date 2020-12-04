import java.util.Scanner;
public class Uri1038{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, qtd;
        double total=0.0;

        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        if (cod == 1){    // digitei codigo 1?
            total = qtd * 4.0;
        }
        else{            // já que o código não é 1, pode ser tanto 2, 3, 4 ou 5
            if (cod == 2){
                total = qtd * 4.50;
            }
            else{  // este else corresponde ao IF da linha 15 - não é nem 1 nem 2, pode ser 3, 4 ou 5
                if (cod == 3){
                    total = qtd * 5.0;
                }
                else{  // este ELSE corresponde ao if da linha 19, ou seja, não é nem 1, 2, ou 3 só pode ser 4 ou 5
                    if (cod == 4){
                        total = qtd * 2.0;
                    }
                    else{  // não é nem 1, nem 2, nem 3, nem 4 - só pode ser 5
                        total = qtd * 1.50;
                    } // fim do if da linha 23
                } // fim do if da linha 19
            } // fim do IF da linha 15
        } // fim do IF da linha 11

        System.out.printf("Total: R$ %.2f%n",total);
    }
}
