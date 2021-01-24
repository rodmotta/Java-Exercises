import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara1036 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        DecimalFormat formata = new DecimalFormat("0.00000");

        if (delta <= 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = " + formata.format(r1).replace(",", "."));
            System.out.println("R2 = " + formata.format(r2).replace(",", "."));
        }
    }
}
/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as
raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima
o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima
sempre o final de linha após cada mensagem.
*/
