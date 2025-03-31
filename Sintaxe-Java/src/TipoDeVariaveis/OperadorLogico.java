package TipoDeVariaveis;

public class OperadorLogico {
    public static void main(String[] args) {
        // && = Operador logico "E"
        // || = Operador logico "OU"

        boolean condicao = true;
        boolean condicao1 = true;

        if (condicao && condicao1) {
            System.out.println("As duas Condições são verdadeiras");
        }
        if (condicao || condicao1) {
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
