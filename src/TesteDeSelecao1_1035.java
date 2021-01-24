import java.util.Locale;
import java.util.Scanner;

public class TesteDeSelecao1_1035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        if (b > c && d > a && c + d > a + b) {
            if (c >= 0 && d >= 0 ){
                if (a % 2 == 0) {
                    System.out.println("Valores aceitos");
                }
            }
        } else {
            System.out.println("Valores nao aceitos");
        }

        entrada.close();
    }
}
/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D
for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem
"Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.
*/