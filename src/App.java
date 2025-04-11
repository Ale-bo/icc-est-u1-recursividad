public class App {
    public static void main(String[] args) throws Exception {

        EjerciciosRecursivos e = new EjerciciosRecursivos();
        int r = e.sumaConsecituvos(5);
        System.out.println(r);

        int fibo=e.fibonacci(5);
        System.out.println("La respuesta es "+ fibo);

        int p = e.getpotencia(2,3);
        System.out.println("2^3 = " + p);	

        int s = e.sumaDigitos(9);
        System.out.println("La suma de los digitos es " + s);

        e.printNumbers(5);
        System.out.println();

        System.out.println(e.reverso(1234));

    } 
}
