import java.util.Locale;
import java.util.Scanner;

public class ConversaoDeTempo1019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int segundos = entrada.nextInt();

        int hour = (segundos / 60) / 60;
        int min = (segundos / 60) % 60;
        int sec = (segundos % 60);

        System.out.println(hour + ":" + min + ":" + sec);

        entrada.close();
    }
}
/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o
 expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/