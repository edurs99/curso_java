/*
 2  8  = 8 -  2 =   6
 9  9  = 9 -  9 =   0 + 24 = 24
22  4  = 4 - 22 = -18 + 24 = 6
*/

import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, hF, dur;

        hI = teclado.nextInt();
        hF = teclado.nextInt();

        dur = hF - hI;

        if (dur <= 0){
            dur = dur + 24;
        }

        System.out.println("O JOGO DUROU "+dur+" HORA(S)");
    }
}


