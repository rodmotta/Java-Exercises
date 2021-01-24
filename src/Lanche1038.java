import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lanche1038 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int codigo = entrada.nextInt();
        int qntd = entrada.nextInt();

        double[] preco = {4.00, 4.50, 5.00, 2.00, 1.50};

        double total = preco[codigo - 1] * qntd;

        DecimalFormat formata = new DecimalFormat("0.00");

        System.out.println("Total: R$ " + formata.format(total).replace(",", "."));

        entrada.close();
    }
}
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir,
calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/
