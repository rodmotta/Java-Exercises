import java.util.Scanner;

public class ProdutoSimples1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        System.out.println("PROD = " + num1*num2);

        entrada.close();
    }
}
/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à
 variável PROD. A seguir mostre a variável PROD com mensagem correspondente.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois
 da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa
 apresentará a mensagem: “Presentation Error”.
*/