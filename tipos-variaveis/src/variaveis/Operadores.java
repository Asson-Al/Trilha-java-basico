package variaveis;

public class Operadores {
    public static void main(String[] args) {
        //Concatenação de texto é feita utilizando +
        //String nomeCopleto = ("Pedro " + "Henrique.");
        //System.out.println(nomeCopleto);

        String concatencao = "?";

        concatencao = 1 + 1 + 1 + "1";

        System.out.println(concatencao);

        concatencao = 1 + "1" + 1 + 1;

        System.out.println(concatencao);

        concatencao = 1 + "1" + 1 + "1";

        System.out.println(concatencao);

        concatencao = "1" + (1 + 1 + 1);

        System.out.println(concatencao);

    }
}
