import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas1021 {
    public static void main(String[] args) {

        double[] listaNotas = {100.00,50.00,20.00,10.00,5.00,2.00};

        double[] listaMoedas = {1.00,0.50,0.25,0.10,0.05,0.01};

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        double valor = entrada.nextDouble();

        DecimalFormat formata = new DecimalFormat("0.00");

        System.out.println("NOTAS:");
        for (int i = 0; i < listaNotas.length; i++) {
            String valorS = formata.format(valor).replace(",",".");
            valor = Double.parseDouble(valorS);
            int res = (int) (valor / listaNotas[i]); // numero de notas
            System.out.println(res + " nota(s) de R$ " + formata.format(listaNotas[i]).replace(",", "."));
            valor -= res * listaNotas[i];
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < listaMoedas.length; i++) {
            String valorS = formata.format(valor).replace(",",".");
            valor = Double.parseDouble(valorS);
            int res = (int) (valor / listaMoedas[i]);
            System.out.println(res + " moeda(s) de R$ " + formata.format(listaMoedas[i]).replace(",", "."));
            valor -= res * listaMoedas[i];
        }
    }
}
/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.
*/