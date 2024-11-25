public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;  // Number of Fibonacci numbers to print
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to " + n + " numbers:");
        
        // Print the first two numbers
        System.out.print(first + " " + second + " ");
        
        // Loop to generate the next Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            
            // Update first and second for the next iteration
            first = second;
            second = next;
        }
    }
}

