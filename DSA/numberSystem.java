class numberSystem {
    static void decimalToBinary(int num){
        String ans = "";
        while(num > 0){
            ans = Integer.toString(num % 2) + ans;
            num /= 2;
        }
        System.out.print(ans);
    }
    static void binaryToOctal(String s){
        int n = s.length();
        if(n % 3 == 2){
            s = "0" + s;
        }else if(n % 3 == 1){
            s = "00" + s;
        }
        n = s.length();
        String ans = "";
        for(int i = 0 ; i < n; i +=3){
            int temp = (s.charAt(i) - '0')*4 + (s.charAt(i + 1) - '0')*2 + (s.charAt(i + 2) - '0')*1;
            ans = ans + Integer.toString(temp);
        }
        System.out.print(ans);
    }
    static void binaryToDecimal(int num){
        int temp = 1;
        int ans = 0;
        while(num > 0){
            if(num % 10 == 1){
                ans += temp;
            }
            temp *= 2;
            num /= 10;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        decimalToBinary(28);
        binaryToOctal("1100110");
        binaryToDecimal(1011);
    }
}