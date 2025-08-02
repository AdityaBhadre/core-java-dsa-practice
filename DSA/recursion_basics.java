

public class recursion_basics {
    //simple recursion function 1 to n
    public static void recur(int i, int f){
        if(f<i){
            return ;
        }
        System.out.println(f);
        recur(i,f-1);
    }

    //return sum of first n numbers
    public static void sumToN(int n){
        int i=0;
        if(n==0){
            return;
        }
        else{
            i=i+n;
            sumToN(n-1);
        }
        System.out.println(i);
    }
    public static void main(String[] args) {
        // recur(1,3);
        sumToN(10);
    }
}
