import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Salario1008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int numero = entrada.nextInt();
        int horas = entrada.nextInt();
        double salarioHora = entrada.nextDouble();

        double salario = horas * salarioHora;

        DecimalFormat formata = new DecimalFormat("0.00");

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + formata.format(salario).replace(",", "."));

        entrada.close();
    }
}
/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade
de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da
igualdade. No caso do salário, também deve haver um espaço em branco após o $.
*/