import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulos1045 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        ArrayList<Double> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);

        Collections.sort(lista, Collections.reverseOrder());

        a = lista.get(0);
        b = lista.get(1);
        c = lista.get(2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c && c == a) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || c == a) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior
dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre
escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
*/
