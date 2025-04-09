public class App {
    public static void main(String[] args) throws Exception {

        int n = 5;
        int resultado = factorial(n);
        System.out.println("Resultado:" + resultado);
    }
    public static int factorial(int n) {
        if (n == 0) {
            System.out.println("Alcance el caso base");
            return 1;
        }
        int resultado = n * factorial(n - 1); 
        System.out.println("Calculando factorial de" + n + "* factorias("+(n-1) + " -1) -1");
        return resultado;
    } 
}
