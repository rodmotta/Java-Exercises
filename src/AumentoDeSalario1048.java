import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class AumentoDeSalario1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double salario = entrada.nextDouble();

        DecimalFormat formata = new DecimalFormat("0.00");

        double novoSalario, ganho;

        if (salario > 2000) {
            novoSalario = (salario * 1.04);
            ganho = novoSalario - salario;
            System.out.println("Novo salario: " + formata.format(novoSalario).replace(",", "."));
            System.out.println("Reajuste ganho: " + formata.format(ganho).replace(",", "."));
            System.out.println("Em percentual: 4 %");
        } else if (salario > 1200) {
            novoSalario = (salario * 1.07);
            ganho = novoSalario - salario;
            System.out.println("Novo salario: " + formata.format(novoSalario).replace(",", "."));
            System.out.println("Reajuste ganho: " + formata.format(ganho).replace(",", "."));
            System.out.println("Em percentual: 7 %");
        } else if (salario > 800) {
            novoSalario = (salario * 1.1);
            ganho = novoSalario - salario;
            System.out.println("Novo salario: " + formata.format(novoSalario).replace(",", "."));
            System.out.println("Reajuste ganho: " + formata.format(ganho).replace(",", "."));
            System.out.println("Em percentual: 10 %");
        } else if (salario > 400) {
            novoSalario = (salario * 1.12);
            ganho = novoSalario - salario;
            System.out.println("Novo salario: " + formata.format(novoSalario).replace(",", "."));
            System.out.println("Reajuste ganho: " + formata.format(ganho).replace(",", "."));
            System.out.println("Em percentual: 12 %");
        } else if (salario >= 0) {
            novoSalario = (salario * 1.15);
            ganho = novoSalario - salario;
            System.out.println("Novo salario: " + formata.format(novoSalario).replace(",", "."));
            System.out.println("Reajuste ganho: " + formata.format(ganho).replace(",", "."));
            System.out.println("Em percentual: 15 %");
        }

        entrada.close();
    }
}
/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
*/
