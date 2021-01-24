import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int senhaValida = 2002;

        boolean autentica = true;

        while (autentica) {
            int senha = entrada.nextInt();
            if (senha == senhaValida) {
                System.out.println("Acesso Permitido");
                autentica = false;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.
*/
