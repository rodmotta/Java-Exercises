import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos1015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        double eixoXpontoA = entrada.nextDouble();
        double eixoYpontoA = entrada.nextDouble();
        double eixoXpontoB = entrada.nextDouble();
        double eixoYpontoB = entrada.nextDouble();

        double res = Math.sqrt(Math.pow(eixoXpontoB - eixoXpontoA, 2) + Math.pow(eixoYpontoB - eixoYpontoA, 2));

        DecimalFormat formata = new DecimalFormat("0.0000");

        System.out.println(formata.format(res).replace(",", "."));

        entrada.close();
    }
}
//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e
//calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

//Entrada
//O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1
// e a segunda linha contém dois valores de ponto flutuante x2 y2.

//Saída
//Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.