import java.util.Locale;
import java.util.Scanner;

public class Triangulo1043 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        if (a + b > c && b + c > a && c + a > b) {
            double perimetroTriangulo = a + b + c;
            System.out.printf(Locale.US, "Perimetro = %.1f\n", perimetroTriangulo);
        } else {
            double areaTrapezio = ((a + b) / 2) * c;
            System.out.printf(Locale.US, "Area = %.1f\n", areaTrapezio);
        }
    }
}
/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro
do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/
