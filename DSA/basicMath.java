
public class basicMath {
    //No. digits in an Integer
    public static int noOfDigits(int a){
        int cnt = 0;
        while(a>0){
            cnt = cnt + 1;
            a = a/10;
        }
        return cnt;
    }

    //reverse a number
    public static void reverseNumber(int x){
        int reverse = 0;
        while(x>0){
            int rem = x%10;
            x /= 10;
            reverse = reverse*10 + rem;
        }
        System.out.println("Reverse of the given number is "+reverse);
    }

    //check if number is palindrome
    public static boolean checkPalindrome(int a){
        int rev = 0;
        int original = a;
        while(a>0){
            int rem = a%10;
            a /= 10;
            rev = rev*10 + rem;
        }
        System.out.println(rev);
        if(original==rev){
            return true;
        }else{
            return false;
        }
    }

    //GCD or HCF
    public static void findGCD(int a,int b){
        int gcd = 1;
        for(int i=1;i<Math.min(a,b);i++){
            if(a%i ==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD is "+gcd);
    }

    //print all divisors
    public static void printDivisor(int n){
         int count = 0;
        for(int i=1;i<n;i++){
           if(n%i==0){
            count++;
            System.out.println("Divisor is "+i);
           }
        }
        System.out.println("Total divisor count "+count);
    }

    //check for prime num
    public static boolean isPrime(int num){
        for(int i=3;i<num;i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // int result = noOfDigits(12345);
        // System.out.println(result);
        // reverseNumber(12345);
        // System.out.println(checkPalindrome(124321));
        // findGCD(1, 2);
        // printDivisor(36);
        boolean a = isPrime(12);
        if (a) {
            System.out.println("it is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}
