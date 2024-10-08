import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci{
   
    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);
        
        while (true) {
            int nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            if (nextFib > n) {
                break;
            }
            fibSequence.add(nextFib);
        }
        
        return fibSequence;
    }  
    public static String pertenceFibonacci(int num) {
        ArrayList<Integer> fibSequence = fibonacci(num);
        if (fibSequence.contains(num)) {
            return "O número " + num + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + num + " não pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();
            String resultado = pertenceFibonacci(numero);
            System.out.println(resultado);
        }
    }
}