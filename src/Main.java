import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("""
            Bem-vindo ao jogo de adivinhação!
            
            Será sorteado pelo programa um número inteiro, este número estará entre 0 e 100.
            Você terá cinco (05) chances para adivinhar qual número é.
            
            Difícil não?!
            
            Por isso a cada tentativa, caso não acerte, será dado uma dica.
            Esta dica informará se o número é maior ou menor em relação ao último número digitado.
            
            Boa sorte!
            """
        );

        Scanner scanner = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);

        int numeroInput = 0;
        int tentativas = 1;
        boolean acertou = false;

        System.out.println(numeroSorteado);


        while (!acertou && tentativas <= 5) {
            if (tentativas > 0) {
                if (numeroSorteado < numeroInput  ) System.out.printf("\nO numero sorteado é menor que %d", numeroInput);
                else System.out.printf("\nO numero sorteado é maior que %d", numeroInput);

            }

            System.out.printf("\nTentativa %d", tentativas);
            System.out.println("Digite um número");
            numeroInput = scanner.nextInt();

            acertou = numeroInput == numeroSorteado;

            if (acertou) {
                System.out.println("Acertou miserável!!!!");
                System.out.println("Parabéns!!!");
            }
            tentativas ++;
        }





    }
}