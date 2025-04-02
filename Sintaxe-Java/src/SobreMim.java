import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class SobreMim {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Qual a sua altura?");
            double altura = scanner.nextDouble();

            System.out.println("Digite o seu nome ?");
            String nome = scanner.next();

            System.out.println("Digite o seu nome ?");
            String sobrenome = scanner.next();

            System.out.println("Qual a sua idade ?");
            int idade = scanner.nextInt();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + " cm.");
        } catch (InputMismatchException e) {

            System.err.println("Os campos idade e altura precisam ser numericos.");
        }
    }
}