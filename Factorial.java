class Factorial{
    public static long compute(int n){
        if(n<0){
            System.out.println("Enter num greater than 0");
            return 0;
        }
        for (int i=0;i<=n;i++){
            fact*=i;
        }
        return fact;

    }
    public static void main(string args[]){
        int n=5;
        long ans=compute(n);
        System.out.println("Factorial ",ans);
    }
}