import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos1060 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int qntd = 0;

        for (int i = 1; i <= 6; i++) {
            double num = entrada.nextDouble();
            if (num > 0) {
                qntd++;
            }
        }

        System.out.printf("%d valores positivos\n", qntd);

        entrada.close();
    }
}
/*
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
*/
