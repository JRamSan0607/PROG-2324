import java.util.random.*;
public class TeoriaArraysII {

    public static void main(String[] args) {


        /**
         * Ejercicio 1. Definir con lenguaje natural los siguientes arrays
         */
        // Ejemplos
        int[] arr;                  // -> Array de enteros con nombre arr
        int[] arr2 = new int[2];    // -> Array de enteros arr2, con tamaño 2
        arr2[0] = 1;                // -> Asigno el valor entero 1 a la posición 0 del array


        // Ahora tú
        int[] arr3 = {2, 3, 1};
        String[] sArr;
        boolean[] bArr = new boolean[5];
        char[] cArr = {'a'};

        cArr[0] = 'b';
        bArr[0] = true;
        bArr[2] = true;
        bArr[3] = false;
        bArr[4] = true;


        /**
         * Ejercicio 2. Definir en Java lo descrito en lenguaje natural
         */
        // Ejemplo
        // Array de Strings de tamaño 4 con nombre despedidas, que tenga en la primera posición "chao", en la segunda "adios", en la tercera "Hasta pronto", y en la última "Hasta nunca"
        String[] despedidas = {"chao", "adios", "hasta pronto", "hasta nunca"};

        // AHORA TÚ
        // Array de enteros de tamaño 11 con nombre notas
        int[] notas = new int[11];
        // La primera posición de notas contiene el valor 0
        notas[0] = 0;
        // La segunda posición de notas contiene el valor 1
        notas[1] = 1;
        // La tercera posición de notas contiene el valor 2
        notas[2] = 2;
        // La cuarta posición de notas contiene el valor 3
        notas[3] = 3;
        // La quinta posición de notas contiene el valor 4
        notas[4] = 4;
        // La sexta posición de notas contiene el valor 5
        notas[5] = 5;
        // La septima posición de notas contiene el valor 6
        notas[6] = 6;
        // La octava posición de notas contiene el valor 7
        notas[7] = 7;
        // La novena posición de notas contiene el valor 8
        notas[8] = 8;
        // La decima posición de notas contiene el valor 9
        notas[9] = 9;
        // La onceava posición de notas contiene el valor 10
        notas[10] = 10;
        // Array de Strings de tamaño 10 llamado users, inicializado pero vacío.
        String[] users = new String[10];
        users[0] = "";
        users[1] = "";
        users[2] = "";
        users[3] = "";
        users[4] = "";
        users[5] = "";
        users[6] = "";
        users[7] = "";
        users[8] = "";
        users[9] = "";
        // Array de booleans de tamaño 10 llamado bans, inicializados todos los elementos del array a false.
        Boolean[] bans = new Boolean[10];
        bans[0] = false;
        bans[1] = false;
        bans[2] = false;
        bans[3] = false;
        bans[4] = false;
        bans[5] = false;
        bans[6] = false;
        bans[7] = false;
        bans[8] = false;
        bans[9] = false;
        // La primera posición de users es "xulito6969"
        users[0] = "xulito6969";
        // La primera posición de bans es true
        bans[0] = true;
        // La segunda posición de users es "userNormalYSimpatico"
        users[1] = "userNormalYSimpatico";
        // La segunda posición de bans es true
        bans[1] = true;
        // La tercera posición de users es "lainezz"
        users[2] = "lainezz";

        /**
         * Ejercicio 3
         * Declarar e inicializar un array de enteros de tamaño 10.
         * Llenar ese array con números aleatorios a vuestra elección.
         * Recorrer dicho array desde la posición 0 hasta la última y mostrar el contenido de cada uno de los elementos.
         * Ejemplo
         * "La posición 0 tiene un elemento con valor 17"
         * "La posición 1 tiene un elemento con valor 99"
         * ...
         */
        int[] numsAleatorios = new int[10];
        numsAleatorios[0] = 18;
        numsAleatorios[1] = 67;
        numsAleatorios[2] = 34;
        numsAleatorios[3] = 8;
        numsAleatorios[4] = 12;
        numsAleatorios[5] = 98;
        numsAleatorios[6] = 56;
        numsAleatorios[7] = 104;
        numsAleatorios[8] = 67;
        numsAleatorios[9] = 17;

        for (int i=0; i<= numsAleatorios.length-1; i++){
            System.out.println("La posición " + i + " tiene un elemento con valor " + numsAleatorios[i] + ".");
        }

        /**
         * Ejercicio 4
         * Declarar e inicializar un array de Strings de tamaño 10
         * Llenar dicho array con cadenas aleatorias a vuestra elección
         * Recorrer dicho array desde la última posición hasta la 0 (es decir, de atrás hacia delante)
         * Ejemplo:
         * "La posición 9 tiene un elemento con valor perro"
         * "La posición 8 tiene..."
         * ...
         */
        String [] cadAleatorias = {"canario", "zorro", "jilguero", "balón", "rata", "guepardo", "león", "ardilla", "gato", "zariguella"};

        for (int i=0; i<= cadAleatorias.length-1; i++){
            System.out.println("La posición " + i + " tiene un elemento con valor " + cadAleatorias[i] + ".");
        }
    }

}
