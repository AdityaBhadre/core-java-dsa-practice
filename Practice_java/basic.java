package Practice_java;
import java.util.*;
class basic{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        basic in =new basic();
        System.out.println("Enter no: ");
        int a =s.nextInt();
        System.out.println(a);
        in.varrDtypes();
    }
    public void varrDtypes(){
        System.out.println("Function for Varriables and Data Types: ");
        int a =10;
        String str = "This is a String";
        char ch ='a';
        float c = 2;
        double b =10.00;
        boolean t =true ;
        short sh =23;
        long l =11222333;
        System.out.println("Variables are integer a = "+a+"\nString str = "+str+"\nCharacter ch = "+ch+"\nfloat c = "+c+"\ndouble b = "+b+"\nboolean t = "+t+"\nshort sh = "+sh+"long l = "+l);
    }
    public void typeCasting(){
        //Implicit type casting
        int a =1;
        float b = a;
        double c = b;
        long l =a;
        
        //Explicit type casting
        int n1 = (int) c;
        int n2 = (int) b;
        int n3 = (int) l;
    }
    public void operators(){
        int a=10,b=2;
        //arithmetic operators
        int add = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int mod = a%b;
        //relational
        if(a>b){
            System.out.println("a is greater than b");
        }// < ; <= ; >= ;  == ; != ;
        //Logical AND &&  OR||
        //Ternary
        int max = a>b?a:b;
        //Assignment
        // = += -= /= *= %= &= ^= |= <<= >>= >>>=
        //unary
        //post increment a++ a-- pre increment ++a --a
    }
    public void statement(){
        int a=1,b=2;
        //if else
        if(a<1){
            System.out.println("If statement");
        }else{
            System.out.println("else statement");
        }
        //else if
        if(a==b){
            System.out.println("if statement");
        }
        else if(a<b){
            System.out.println("else if statement");
        }
        else{
            System.out.println("else statement");
        }
        //nested if
        if(a<b){
            if(a==1){
                if(a==(2-1)){
                    System.out.println("a is 1");
                }
            }
        }
        //switch case 
        int c=0;
        switch(c){
            case 1:
            //execute this block;
            break;
            case 2:
            //execute this block;
            break;
        }
    }
    public void loops(){
        //for loop
        for(int i =0;i<10;i++){
            System.out.println("1");
        }
        //while
        int a=0;
        while(a<5){
            System.out.println(a);
            a++;
        }
        //do-while
        do{
            System.out.println(a);
            a++;
        }while(a<5);
        //for each
        int arr[]={1,2,3,4,5};
        for(int x:arr){
            System.out.println(arr[x]);
        }
    }
}