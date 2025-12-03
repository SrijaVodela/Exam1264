class Factorial {

    public static long compute(int n) {
        if (n < 0) {
            System.out.println("Enter num greater than 0");
            return 0;
        }

        long fact = 1; 

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String args[]) {
        int n = 5;
        long ans = compute(n);
        System.out.println("Factorial: " + ans);
    }
}
