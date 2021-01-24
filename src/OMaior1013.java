import java.util.Locale;
import java.util.Scanner;

public class OMaior1013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorBC + " eh o maior");

        entrada.close();
    }
}
/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */