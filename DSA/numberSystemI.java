public class numberSystemI {
    static void octalToBinary(int num){
        int temp = 1;
        int ans = 0;
        String s = "";
        while(num > 0){
            int d = num % 10;
            ans = d * temp + ans;
            temp *= 8;
            num /= 10;
        }
        System.out.println("Octal to Decimal : "+ans);
        while(ans > 0){
            s = Integer.toString(ans % 2) + s;
            ans /= 2;
        }
        if(s.length() % 3 == 2){
            s = "0" + s;
        }
        else if(s.length() % 3 == 1){
            s = "00"+ s;
        }
        System.out.println("Octal to Binary : "+s);
    }
    static void decimalToOctal(int num){
        String ans = "";
        String s = "";
        while(num > 0){
            s = Integer.toString(num % 2) + s;
            num /= 2;
        }
        int l = s.length();
        if(l % 3 == 2){
            s = "0" + s;
        }else if(l % 3 == 1){
            s = "00" + s;
        }
        l = s.length();
        for(int i = 0; i < l; i +=3){
            int temp = (s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 +(s.charAt(i + 2) - '0') * 1;
            ans = ans + Integer.toString(temp);
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        octalToBinary(345);
        decimalToOctal(17);
    }
}
