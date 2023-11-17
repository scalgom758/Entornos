package es.iessoterohernandez.daw.endes;

public class FibonacciMain {
    public static void main(String[] args) {
        int numero = 10; // Puedes cambiar el número según tus necesidades
        int resultado = Fibonacci.calcularFibonacci(numero);
        System.out.println("El término " + numero + " de la sucesión de Fibonacci es: " + resultado);
    }
}
