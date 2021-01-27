import java.util.Locale;
import java.util.Scanner;

public class QuadradoDePares1073 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int num = entrada.nextInt();

        for (int i = 2; i <= num; i += 2) {
            System.out.printf("%d^2 = %d\n", i, (int) Math.pow(i, 2));
        }
    }
}
/*
Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

Entrada
A entrada contém um valor inteiro N (5 < N < 2000).

Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará
resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
*/