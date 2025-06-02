package specialTopic;

public class Fibonacci {
    public void fibonacciExample(){
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}