import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Consumo1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int km = entrada.nextInt();
        double gasto = entrada.nextDouble();

        DecimalFormat formata = new DecimalFormat("0.000");

        double res = km / gasto;

        System.out.println(formata.format(res).replace(",", ".") + " km/l");

        entrada.close();
    }
}
/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de
combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km),
e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
*/