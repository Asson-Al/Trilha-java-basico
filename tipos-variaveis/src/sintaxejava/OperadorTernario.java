package sintaxejava;

public class OperadorTernario {
    public static void main(String[] args) {

        int a = 6;
        int b = 6;

        //Uma condição ternaria é como se fosse um if normal, porém,
        // de uma forma em que toda a sua estrutura estará escrita em uma unica linha.

        //ESTRUTURA <Expressão condicional> ? <Caso condição seja true> : <Caso seja false>

        String resultado = a == b ? "verdadeiro" : "Falso";
        //pode ser atribuido tanto String quanto int
        int valor = a == b ? 1 : 0;

        System.out.println(resultado);
        System.out.println(valor);


    }
}
