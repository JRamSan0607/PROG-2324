// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ApuntesArrays {
    public static void main(String[] args) {
        // Apuntes Arrays
        int [] arr;
        char [] cArr = new char [10];
        //Declaramos un array de caracteres y lo inicializamos con tamaño 10 (Vacío)

        //Como declarar un Array String
        String [] sArr = {"hola", "adios"};
        //Como dar a un elemento un valor específico en un Array
        int []x;
        double [] dArr = new double [5];
        //Aquí colocamos en la posición (en este caso, 0 y 4) en el Array y su valor
        dArr [4] = 2.01;
        dArr [0] = 0.01;

        //Mostrar por consola el Array String
        for (int i=0; i<= sArr.length-1; i++){
            System.out.println("El elemento " + sArr[i] + "está en la posición " + i);
        }
    }
}