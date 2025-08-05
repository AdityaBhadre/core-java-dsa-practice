class number_III {
    static void addFraction(int n1, int d1, int n2, int d2){
        int sum = 0;
        int d = 0;
        int min = 0;
        if(d1 == d2){
            sum = n1 + n2;
            d = d1;
        }else{
            d = d1 * d2;
            d1 = d / d1;
            d2 = d / d2;
            n1 = n1 * d1;
            n2 = n2 * d2;
            sum = n1 + n2;
            min = Math.min(d, sum);
            for(int i = 2; i < min; i++){
                if(sum % i == 0 && d % i ==0){
                    sum /= i;
                    d /= i;
                }
            }
        }
        if(sum % d == 0){
            sum /= d;
            System.out.print(sum);
        }
        else{
            System.out.print(sum+"/"+d);
        }
    }
    static void possibleCombination(int n, int r){
        int sum = 1;
        for(int i = n; i > (n - r); i--){
            sum *= i;
        }
        System.out.print("Total Combinations: "+sum);
    }
    static void isAbundantNumber(int num){
        int sum = 0;
        for(int i = 1; i < Math.sqrt(num); i++){
            if(num % i == 0){
                if( num / i == i){
                    sum += i ;
                }else{
                    sum += i;
                    sum += num / i ;
                }
            }
        }
        if(sum > num){
            System.out.print(num+" is an Abundant Number");
        }
        else{
            System.out.print(num+" is not an Abundant Number");
        }
    }
    static void findRoots(int a, int b, int c){
        if( a == 0 ){
            System.out.print("Roots are Invalid");
            return ;
        }
        int d = b * b - (4 * a * c);
        double sqrt_val = Math.sqrt(Math.abs(d));
        if(d > 0){
            System.out.println("Roots are real and different");
            double root1 = (double)(- b + sqrt_val) / (2 * a);
            double root2 = (double)(- b - sqrt_val) / (2 * a);
            System.out.print(root1+ "\n"+root2);
        }else if(d == 0){
            System.out.println("Roots are real and equal");
            double root1 = (double)(- b) / (2 * a);
            double root2 = (double)(- b) / (2 * a);
            System.out.print(root1 +"\n"+root2);
        }else{
            System.out.println("Roots are complex");
            System.out.print((double)(- b) / (2 * a)+ "+ i"+ sqrt_val+"\n"+(double)(- b) / (2 * a)+"- i"+sqrt_val );
        }
    }
    static void replace0By1(int num){
        int d;
        int ans = 0;
        int temp = 1;
        if(num == 0){
            System.out.print(1);
        }
        while(num > 0){
            d = num % 10;
            if(d == 0){
                d = 1;
            }
            ans = d * temp + ans ;
            num /= 10;
            temp *= 10;
        }
        System.out.print(ans);
    }   
    public static void main(String[] args) {
        int a = 1, b = -3, c = -10;
        findRoots(a,b,c);
        replace0By1(1002301);
        addFraction(1,5,1,4);
        possibleCombination(6, 4);
        isAbundantNumber(18);
    }
}