import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PositivosEMedia1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int qntd = 0;
        double total = 0;

        for (int i = 1; i <= 6; i++) {
            double num = entrada.nextDouble();
            if (num > 0) {
                qntd++;
                total += num;
            }
        }

        DecimalFormat formata = new DecimalFormat("0.0");

        System.out.printf("%d valores positivos\n", qntd);
        System.out.println(formata.format(total / qntd).replace(",","."));

        entrada.close();
    }
}
/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar
a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos
digitados.
*/
