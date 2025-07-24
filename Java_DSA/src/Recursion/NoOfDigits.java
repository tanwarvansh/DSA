package Recursion;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(noOfDigits(12345455));
    }
    public static int noOfDigits(int n){
        if(n<=0)
        return 0;

        return 1+noOfDigits(n/10);
    }

}
