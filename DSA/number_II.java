import java.util.ArrayList;
class number_II{
    public static void isHarshadNumber(int num){
        int n = String.valueOf(num).length();
        int ori = num;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int ld = num % 10;
            sum += ld;
            num /= 10; 
        }
        if(num % sum == 0){
            System.out.print(ori+" is a Harshad Number");
        }
        else{
            System.out.print(num+" is not a Harshad Number");
        }
    }
    public static void isAutomorphic(int num){
        int sq = (int)Math.pow(num, 2);
        int ori = sq;
        int n = String.valueOf(num).length();
        int div = 1;
        for(int i = 1; i <= n; i++){
            div *= 10;
        }
        int ld = sq % div;
        if(ld == num){
            System.out.print("Square of "+num+" is "+ori+" Number is Automorphic");
        }else{
            System.out.print("Number is not Automorphic");
        }
    }
    public static ArrayList <Integer> isPrimeFactor(int num){
      ArrayList <Integer> primeFactor = new ArrayList<>();
      for(int i = 2; i <= num; i++){
          if(num % i == 0){
              primeFactor.add(i);
          }
          while(num % i == 0){
              num = num / i;
          }
      }
      return primeFactor;
    }
    static boolean isLeapYear(int year){
        if( year % 400 == 0){
            return true ;
        }
        if(year % 100 == 0){
            return false;
        }
        if(year % 4 == 0){
            return true;
        }
          return false;
    }
    public static void isArmstrongNum(int n){
        int l = String.valueOf(n).length();
        int o = n;
        int sum = 0;
        while(n > 0){
            int ld = n % 10;
            sum += Math.pow(ld, l);
            n /= 10;
        }
        if(sum == o){
            System.out.print(o+" is an Armstrong Number");
        }
        else{
            System.out.print(o + " is not an Armstrong Number");
        }
    }
    public static void main(String[] args) {
        isHarshadNumber(378);
        isAutomorphic(76);
        int num = 60;
        ArrayList <Integer> ans = isPrimeFactor(num);
        System.out.print("Prime Factor for "+ num +": ");
        for(int factor : ans){
            System.out.print(factor+" ");
        }
        int year = 1900;
        if(isLeapYear(year) == true){
            System.out.print(year+" is a leap year");
        }
        else{
            System.out.print("It is not a leap year");
        }
        isArmstrongNum(371);
    }
}