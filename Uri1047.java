/*
vou utilizar exatamente o mesmo raciocínio do 1046
entretanto antes, vou converter todo o meu método (valores) para minutos e fazer exatamente o 
mesmo tratamento
dur = TempoF - TempoI
dur <= 0 ->> somo 24, porém em minutos
*/
import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, hF, mI, mF, dH, dM, tempoI, tempoF, dur;
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        tempoI = hI * 60 + mI; // converti a hora/minuto inicial para minuto
        tempoF = hF * 60 + mF; // converti a hora/minuto final para minutos

        dur = tempoF - tempoI;

        if (dur <= 0){
            dur = dur + 24*60; // 1 dia em minutos
        }

        dH = dur / 60;
        dM = dur % 60;

        System.out.println("O JOGO DUROU "+dH+" HORA(S) E "+dM + " MINUTO(S)");
    }
}