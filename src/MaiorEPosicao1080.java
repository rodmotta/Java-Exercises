import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class MaiorEPosicao1080 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            int valor = entrada.nextInt();
            lista.add(valor);
        }
        System.out.println(Collections.max(lista));
        System.out.println(lista.indexOf(Collections.max(lista)) + 1);
    }
}
/*
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/