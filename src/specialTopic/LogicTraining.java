package specialTopic;

public class LogicTraining {
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

    public void pyramidPattern(){
        int n = 5;
        int k = 2*n - 2;

        for(int i=0; i<n; i ++){
            for(int j=0; j <k; j++){
                System.out.print(" ");
            }
            k -=1;
            for(int x=0; x<=i; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}