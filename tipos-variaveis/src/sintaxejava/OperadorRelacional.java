package sintaxejava;

public class OperadorRelacional {
    public static void main(String[] args) {

        //Pode ser utilizado em Strings.

        String nomeUm = "Pedro";
        String nomeDois = "Pedro";

        // equals = serve para comparar textos e objetos.

        System.out.println(nomeUm.equals(nomeDois));

        //== IGUAL

        int numero1 = 1;
        int numero2 = 1;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual ao numeroDois? "+simNao);

        //!= DIFERENTE

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente ao numeroDois? "+simNao);

        //> MAIOR QUE

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? "+simNao);

        //>= MAIOR OU IGUAL

        simNao = numero1 >= numero2;
        System.out.println("numeroUm é maior ou igual ao numeroDois? "+simNao);

        //< MENOR QUE

        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor que numeroDois? "+simNao);

        //<= MENOR OU IGUAL

        simNao = numero1 <= numero2;
        System.out.println("numeroUm é maior ou igual ao numeroDois? "+simNao);

    }
}
