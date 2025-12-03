class TestFactorial {
    public static void main(String args[]) {
        int n = -3;
        long ans = Factorial.compute(n);
        if (n < 0) {
            System.out.println("Don't enter negative number");
        } else {
            System.out.println("Factorial: " + ans);
        }
    }
}
