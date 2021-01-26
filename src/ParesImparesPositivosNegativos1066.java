import java.util.Locale;
import java.util.Scanner;

public class ParesImparesPositivosNegativos1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int qntdPar = 0;
        int qntdImpar = 0;
        int qntdPositivo = 0;
        int qntdNegativo = 0;

        for (int i = 1; i <= 5; i++) {
            int valor = entrada.nextInt();
            if (valor % 2 == 0) {
                qntdPar++;
                if (valor > 0) {
                    qntdPositivo++;
                } else if (valor < 0) {
                    qntdNegativo++;
                }
            } else {
                qntdImpar++;
                if (valor > 0) {
                    qntdPositivo++;
                } else if (valor < 0) {
                    qntdNegativo++;
                }
            }
        }

        System.out.printf("%d valor(es) par(es)\n", qntdPar);
        System.out.printf("%d valor(es) impar(es)\n", qntdImpar);
        System.out.printf("%d valor(es) positivo(s)\n", qntdPositivo);
        System.out.printf("%d valor(es) negativo(s)\n", qntdNegativo);

    }
}
/*
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares,
quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
*/
