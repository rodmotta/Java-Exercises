import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Media2_1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        double num3 = entrada.nextDouble();

        double res = ((2 * num1) + (3 * num2) + (5 * num3)) / (2 + 3 + 5);

        DecimalFormat formata = new DecimalFormat("0.0");

        System.out.println("MEDIA = " + formata.format(res).replace(",","."));
        entrada.close();
    }
}
/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno,
 sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir
 de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um
 espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de
 linha após o resultado, caso contrário, você receberá "Presentation Error".
 */