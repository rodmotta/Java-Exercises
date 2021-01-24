import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Area1012 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) / 2) * c;
        double quadrado = b * b;
        double retangulo = a * b;

        DecimalFormat formata = new DecimalFormat("0.000");

        System.out.println("TRIANGULO: " + formata.format(triangulo).replace(",", "."));
        System.out.println("CIRCULO: " + formata.format(circulo).replace(",", "."));
        System.out.println("TRAPEZIO: " + formata.format(trapezio).replace(",", "."));
        System.out.println("QUADRADO: " + formata.format(quadrado).replace(",", "."));
        System.out.println("RETANGULO: " + formata.format(retangulo).replace(",", "."));

        entrada.close();
    }
}
/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser
apresentado com 3 dígitos após o ponto decimal.
*/