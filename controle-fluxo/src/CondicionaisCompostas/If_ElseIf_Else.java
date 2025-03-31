package CondicionaisCompostas;

public class If_ElseIf_Else {
    public static void main(String[] args) {

        int nota = 6;

        if (nota>=7)
            System.out.println("O aluno esta aprovado.");

        else if (nota>=5 && nota<7)
            System.out.println("Prova de recuperação");

        else
            System.out.println("O aluno foi reprovado");
    }
}
