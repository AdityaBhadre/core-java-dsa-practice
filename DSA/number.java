import java.util.*;
class number {
    public static void sumOfGP(float a, float r, int n){
        float sum = 0;
        for(int i = 0; i < n; i++){
            sum += a;
            a *= r;
        }
        //using formula
        // float sum = a*((float)Math.pow(r,n) - 1)/(r-1);
        System.out.print(sum);
    }
    public static void sumOfAP(float a, float d, int n){
        float sum =0;
        // using formula
        // float sum = (n / 2)*(2* a + (n - 1) * d);
        for(int i = 1; i <= n; i++){
            sum += a;
            a += d;
        }
        System.out.print(sum);
    }
    public static void sumOfN(int n){
        int sum = 0;
        //using formula
        // sum = n*(n+1)/2;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.print(sum);
    }
    public static void isNegOrPos(int n){
        if(n > 0){
            System.out.print("Number is Positive");
        }else if(n == 0){
            System.out.print("Number is Neutral");
        }else{
            System.out.print("Number is Negative");
        }
    }
    public static void isOddOrEven(int num){
        if(num % 2 == 0){
            System.out.print("Num is even");
        }else{
            System.out.print("Num is odd");
        }
    }
    public static void isPerfectNum(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.print(num+" is Perfect Number");
        }else{
            System.out.print(num+" is not Perfect Number");
        }
    }
    public static void main(String[] args) {
        int num = 8;
        float a = 1 ,r = 0.5f ;
        int n = 3;
        sumOfGP(a, r, n);
        isPerfectNum(num);
        isOddOrEven(num);
        isNegOrPos(num);
        sumOfN(num);
        sumOfAP(2,2,4);
    }
}