import java.util.Locale;
import java.util.Scanner;

public class Cedulas1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int valor = entrada.nextInt();

        int[] listaNotas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);
        for (int i = 0; i < listaNotas.length; i++) {
            int numNotas = valor / listaNotas[i];
            valor = valor % listaNotas[i];
            System.out.println(numNotas + " nota(s) de R$ " + listaNotas[i] + ",00");
        }

        entrada.close();
    }
}
/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser
decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação
de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo
fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará
a mensagem: “Presentation Error”.
*/