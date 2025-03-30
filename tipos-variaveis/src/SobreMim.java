import java.util.Scanner;
import java.util.Locale;

public class SobreMim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual a sua altura?");
        double altura = scanner.nextDouble();
        System.out.println();
        String nome = scanner.next();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Olá, me chamo" + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
    }
}