package SwitchCase;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "GG";

        //Break é usado para não continuidade do restante do codigo
        //Caso não seja utilizado A funcinabilidade pode ser vista no PlanoOperadora

        switch (sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;

            }case "G":{
                System.out.println("Grande");
                break;

            }case "GG":{
                System.out.println("Gigante");
                break;

            }case "EXG":{
                System.out.println("ExtraGrande");
                break;

            }
            default:
                System.out.println("Indefinido");
        }
    }
}
