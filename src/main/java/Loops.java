public class Loops {

    /**
     * Reto 1: Suma de elementos con while
     * Usa un bucle while para recorrer el array "numbers" y sumar todos sus elementos.
     * No cambies los valores del array.
     * Crea una variable llamada "sum" donde acumules el resultado y devuélvela.
     * <p>
     * Resultado esperado: 24
     */
    public static int sumArrayWhile() {
        int[] numbers = {4, 6, 9, 5};
        int sum = 0;
        int contador = 0;
        while (contador < numbers.length) {
            //System.out.println("El contador vale: " + contador);
            sum = sum + numbers[contador];
            // 3. ¡IMPORTANTE! Incrementamos el contador para no crear un bucle infinito
            contador++;
        }

        // Tu código aquí (usa while)
        // consejo: declara la variable "sum" fuera del loop
        return sum; // Sustituye el 0 por la variable sum
    }

    /**
     * Reto 2: Contar números pares con DO WHILE
     * Usa el bucle do while para recorrer el array "numbers" y contar cuántos números son pares.
     * No cambies los valores del array. (no se puede hacer trampitas)
     * Crea una variable llamada "count" donde acumules el resultado.
     * <p>
     * Resultado esperado: 3
     */
    public static int countEvenNumbersDoWhile() {
        int[] numbers = {4, 6, 9, 5, 8};
        int count = 0;
        // Tu código aquí (usa do while)
        int contador = 0;

        do {
            //System.out.println("El contador vale: " + contador);
            if (numbers[contador] % 2 == 0)
                count = count + 1;
            contador++; // Incrementamos
        } while (contador < numbers.length); // 2. ...y "mientras" esto sea verdadero, repetir.

        //System.out.println("¡Bucle terminado!");
        return count; // Sustituye el 0 por la variable count
    }

    /**
     * Reto 3: Recorrer un array con FOR BÁSICO
     * Usa un bucle for para recorrer el array "numbers" y devolver el número más grande.
     * No cambies los valores del array.
     * Crea una variable llamada "max" donde almacenes el resultado.
     * <p>
     * Resultado esperado: 9
     */
    public static int findMaxWithFor() {
        int[] numbers = {4, 6, 9, 5, 3, 2};
        int max = 0;

        // Tu código aquí (usa for)
        // consejo: declara la variable "max" fuera del loop
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max; // Sustituye el 0 por la variable max
    }

    public static void main(String[] args) {
        // Puedes probar tus métodos aquí si quieres.
        // Cuando le des a "Run" ejecutará el main y podrás ver los resultados.

        System.out.println("Reto 1: Suma de elementos con while");
        System.out.println("Resultado: " + sumArrayWhile());
        System.out.println("Reto 2: Contar números pares con DO WHILE");
        System.out.println("Resultado: " + countEvenNumbersDoWhile());
        System.out.println("Reto 3: Recorrer un array con FOR BÁSICO");
        System.out.println("Resultado: " + findMaxWithFor());
    }
}
