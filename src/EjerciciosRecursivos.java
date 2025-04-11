public class EjerciciosRecursivos {
    public int fibonacci(int n) {
        if (n<=1){               ///PRIMERA FORMA SE EXPRESAR
            return n;
        }
        //if (n == 0 || n == 1) {  ///SEGUNDA FORMA SE EXPRESAR
            //return n;
        //}
        // if (n == 0) {           ///TERCERA FORMA SE EXPRESAR
        // return 0;
        // }
        // esle if (n == 1) {
        // return 1;
        //}
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumaConsecituvos(int n) {
        
        //if (n==1) return 1;
        //return n + sumaConsecituvos(n-1);

        if (n==1) {
            return 1;
    }
    int resultadoParcial = sumaConsecituvos(n-1);
    int resultado = resultadoParcial + n;
    return resultado;
}
/*
 * Escribe una funcion recursiva que calcule la potencia
 * de un numero base elevado a un exponente entero
 * por ejemplo, si la base es 2 y exponente es 3
 * la funcion debe devolver 8.
 */
    public int getpotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * getpotencia(base, exponente-1);
    }

/*
 * SUMA DE DIGITOS DE UN NUMERO:
 * si el numero es menor que 10; lo cual significa que solo tiene
 * un digito, se devueleve el numero mismo. En caso contrario, se extrae el ultimo digito utilizando el operador
 * modulo % y se calcula el los digitos menos el ultimo utilizando la division entera /10. Luego, se realiza una llamada 
 * recursiva a sumaDigitos con el resto y se suma el ultimo digito
 */
    public int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        int resto = numero % 10;
        int digitos = numero / 10;
        return digitos + sumaDigitos(resto);
    }
    
}
