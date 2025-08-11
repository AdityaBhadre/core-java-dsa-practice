public class stringQuestions_I{
    public static void onlyAlphabets(String s){
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            int ch = (int)s.charAt(i);
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                str.append(s.charAt(i));
            }
        }
        System.out.print(str);
    }
    public static void removeSpaces(String s){
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != ' '){
                str.append(s.charAt(i));
            }
        }
        System.out.print(str);
    }
    public static void removeVovels(String s){
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            char lch = Character.toLowerCase(ch);
            if(lch != 'a' && lch != 'e' && lch != 'i' && lch != 'o' && lch != 'u'){
                str.append(ch);
            }
        }
        System.out.print(str);
    }
    public static void countVovels(String s){
        int n = s.length();
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Total number of vovels is "+count);
    }
    public static void isPalindrome(String s){
        char arr[] = s.toCharArray();
        String res = "";
        for(int i = 0; i < s.length() ; i++){
            res = arr[i] + res;
        }
        if(s.equals(res)){
            System.out.print("String "+s+" is Palindrome");
        }else{
            System.out.print("String "+s+" is not Palindrome");
        }
    }
    public static void main(String [] args){
        onlyAlphabets("%%^%The ** Name ()(!)IS^!$~^Aditya");
        removeSpaces("The Name Is Aditya");
        removeVovels("The Name Is Aditya");
        countVovels("The Name Is Aditya");
        isPalindrome("aaabbbcbbbaaa");
    }
}