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
    
}
