package if_else;

public class IdadeMinima {
    public static void main(String[] args) {
        //retorna um valor inteiro
        int idade = 21;
        //retorna um valor verdadeiro e falso
        boolean idadeMinima = idade >= 18;

        //if = Se; sé a condição for correta o código vai rodar.
        if (idadeMinima) {

            System.out.println("A sua idade é igual a: " + idade);
            System.out.println("Você esta liberado para entrar na feta pois você é maior de idade.");

        }
        //else = se não; se a condição a cima foi falsa ira rodar somente a segunda parte do código.
        else {
            System.out.println("A sua idade é igual a: " + idade);
            System.out.println("Você não esta liberado para entrar na feta pois você é menor de idade.");
        }

    }
}
