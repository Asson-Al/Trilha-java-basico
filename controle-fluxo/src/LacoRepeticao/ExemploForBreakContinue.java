package LacoRepeticao;

public class ExemploForBreakContinue {

    //continue= continua o codigo e break = parar o codigo quando passa por ele.
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);


        }
    }
}
