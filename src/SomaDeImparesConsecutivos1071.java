import java.util.Locale;
import java.util.Scanner;

public class SomaDeImparesConsecutivos1071 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int total = 0;
        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        } else {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        }
        System.out.println(total);
    }
}
/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores
fornecidos na entrada que deverá caber em um inteiro.
*/