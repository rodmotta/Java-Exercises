import java.util.Locale;
import java.util.Scanner;

public class ParesEntreCincoNumeros1065 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int qntdPar = 0;

        for (int i = 1; i <= 5; i++) {
            int valor = entrada.nextInt();
            if (valor % 2 == 0) {
                qntdPar++;
            }
        }

        System.out.printf("%d valores pares\n", qntdPar);
    }
}
/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
*/