public class App {

    //Criacao de metodo para somar "double":
    static double some(double numero1, double numero2) {
        return numero1 + numero2;
    }

    //Criacao de metodo de teste de boolean:
    static boolean booleanTest(byte numero5, byte numero6){
        boolean isBoolean = numero5 == numero6;
        return isBoolean;
    }

    public static void main(String[] args) {

        //Soma de inteiros:
        int number1 = 1;
        int number2 = 5;

        int some1 = number1 + number2;

        System.out.println("Sua soma é " + some1);

        // Soma com numero flutuante:
        float number3 = 1.26f;
        float number4 = 1.78f;

        float some2 = number3 + number4;

        System.out.println("Sua soma de floats é " + some2);

        //Invocacao de metodo de soma de numero "double":
        double result = some(2.4, 6.8);
        System.out.println(result);

        //Invocacao de metodo de teste de "boolean":
        boolean r = booleanTest((byte) 10, (byte) 10);
        System.out.println(r);
    }


}
