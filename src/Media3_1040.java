import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Media3_1040 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        DecimalFormat formata = new DecimalFormat("0.0");

        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double n4 = entrada.nextDouble();

        double media = ((2 * n1) + (3 * n2) + (4 * n3) + (1 * n4)) / (2 + 3 + 4 + 1);

        System.out.println("Media: " + formata.format(media).replace(",", "."));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media < 7) {
            System.out.println("Aluno em exame.");
            double nExame = entrada.nextDouble();
            System.out.println("Nota do exame: " + formata.format(nExame).replace(",", "."));
            media = (media + nExame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + formata.format(media).replace(",", "."));
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
        entrada.close();
    }
}
/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela
mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada
for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9,
inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a
mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média
anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais )
ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter
pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição
 do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
*/