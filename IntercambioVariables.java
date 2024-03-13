public class IntercambioVariables {
    public static void main(String[] args) {
        // Definir dos variables
        int variable1 = 5;
        int variable2 = 10;

        System.out.println("Antes del intercambio:");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);

        // Intercambiar los valores
        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;

        System.out.println("\nDespués del intercambio:");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
    }
}
