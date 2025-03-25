package if_else;

public class IdadeMinima {
    public static void main(String[] args) {
        int idade = 18;
        boolean idadeMinima = idade >= 18;

        if (idadeMinima) {

            System.out.println("A sua idade é igual a: " + idade);
            System.out.println("Você esta liberado para entrar na feta pois você é maior de idade.");

        } else {
            System.out.println("A sua idade é igual a: " + idade);
            System.out.println("Você não esta liberado para entrar na feta pois você é menor de idade.");
        }

    }
}
