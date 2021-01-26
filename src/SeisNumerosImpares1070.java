import java.util.Locale;
import java.util.Scanner;

public class SeisNumerosImpares1070 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int num = entrada.nextInt();

        int contador = 0;

        while (contador < 6) {
            if (num % 2 == 1) {
                System.out.println(num);
                contador++;
            }
            num++;
        }
    }
}
/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha,
inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
*/