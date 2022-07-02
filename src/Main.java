import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class Main {
    public static void main(String[] args) {

        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
          Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

        int num = 0;
        if (num > 0){
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else if(num == 0){
            System.out.println("El numero es 0");
        }

        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
            1)Incrementar el valor de la variable en uno cada vez que se ejecute.
            2)Mostrarlo por pantalla cada vez que se ejecute.*/

        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        /*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.*/



        do{
            numeroWhile ++;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
        por pantalla.*/

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
        del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la
        estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una
        estación.*/

        int estacion = 5;

        switch (estacion){
            case 1:
                System.out.println("Estas en la estacion 'VERANO'");
                break;
            case 2:
                System.out.println("Estas en la estacion 'OTOÑO'");
                break;
            case 3:
                System.out.println("Estas en la estacion 'INVIERNO'");
                break;
            case 4:
                System.out.println("Estas en la estacion'PRIMAVERA'");
                break;
            default:
                System.out.printf("El valor ingresado no es una estacion");
        }

    }
}