public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci series : ");
        for(int i =0; i<=n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);

    }
}

