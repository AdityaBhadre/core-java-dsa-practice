package Practice_java;
public class method {

    static void myMethod(){
        System.out.println("This is a simple method");
    }
    
    //method parameters and arguments
    static void paraArgsMethod(String name, int age){
        System.out.println(name+" is "+age+" years old");
    }

    //mathod overloading with return value
    static int add(int a){
        return a+10;
    }
    static float add(float a){
        return a+10;
    }
    static double add(double a,double b){
        return a+b;
    }
    
    //Method Scope
    static void myMethod1(){
        //code here CANNOT use x
        int x = 10;
        //code here CAN use x 
        //Block Scope code here CANNOT use y 
        {
            //code here CANNOT use y
            int y = 10;
            //code here CAN use x
        }
        //code here CANNOT use y
    }

    //Recursion
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }
    public static void main(String args[]){
        //this is the main method
        myMethod();
        paraArgsMethod("Aditya", 21);//method call with exact same no. of arguments as parameters
        int myInt = add(10);
        float myFloat = add(10.12f);
        double myDouble  = add(10.10,10.11);
        System.out.println(myInt+" "+myFloat+" "+myDouble);
        int result = sum(4);
        System.out.println(result);
    }
}
