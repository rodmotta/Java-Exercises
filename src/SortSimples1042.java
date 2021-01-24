import java.util.*;

public class SortSimples1042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();

        List<Integer> lista = new ArrayList();
        lista.add(num1);
        lista.add(num2);
        lista.add(num3);

        for (int i = 0; i < lista.size(); i++) {
            Collections.sort(lista);
            System.out.println(lista.get(i));
        }

        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        entrada.close();
    }
}
/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha
em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
*/
