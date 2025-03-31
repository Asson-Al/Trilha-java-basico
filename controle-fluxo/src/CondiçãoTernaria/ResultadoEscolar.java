package CondiçãoTernaria;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

       String resultado = nota >= 7 ? "Você esta aprovado." : "infelismente você foi reprovado";

        System.out.println(resultado);
    }
}
