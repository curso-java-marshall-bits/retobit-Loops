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
        // Tu código aquí (usa while)
        //bucle while
        int index = 0;
        int sum = 0;
        while(index < numbers.length){
            //System.out.println("Esto es un while y el resultado del index es: " + numbers[index]);
            sum =  sum +  numbers[index] ;
           index++; // si el contador está aquí me imprime bien desde el 1 hasta el 5


        }
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


        int counter = 0;
        int count = 0;
        // Tu código aquí (usa do while)
        do {
            if (numbers[counter]%2==0) {
                //System.out.println("Valor de i = " + numbers[counter]);
                count++;
            }
            counter++;

        }while(counter < numbers.length );




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
        //recorriendo con un loop sencillo (for simple)
        for (int indice=0; indice< numbers.length; indice++){
            //System.out.println("El valor de índice es: " + numbers[indice]);
             max =  Math.max(max,numbers[indice]) ;
        }

        // consejo: declara la variable "max" fuera del loop

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
