import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar1074 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int num = entrada.nextInt();

        for (int i = 0; i < num; i++) {
            int valor = entrada.nextInt();
            if (valor == 0) {
                System.out.println("NULL");
            } else if (valor > 0 && valor % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (valor < 0 && valor % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (valor > 0 && valor % 2 == 1) {
                System.out.println("ODD POSITIVE");
            } else {
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}
/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido,
mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo
(NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição
zero é par, seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de
teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser
maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
*/