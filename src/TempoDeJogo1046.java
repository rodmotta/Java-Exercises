import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo1046 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int hrInicial = entrada.nextInt();
        int hrFinal = entrada.nextInt();
        int res;

        if (hrInicial >= hrFinal) {
            res = (24 - hrInicial) + hrFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", res);
        } else {
            res = hrFinal - hrInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", res);
        }
    }
}
/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em
 um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
*/