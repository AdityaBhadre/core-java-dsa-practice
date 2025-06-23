package DSA;
import java.util.*;
public class patterns{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<=n*2-1;i++){
            int star = i;
            if(i>n){
                star = n*2-i;
            }
            for(int j=1;j<=star;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
/*
for(int i=0;i<5;i++){
    for(int j=0;j<5;j++){
        System.out.print(" * ");
    }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 
for(int i=0;i<5;i++){
    for(int j=0;j<=i;j++){
        System.out.print(" * ");
    }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java 
 * 
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *

for(int i=0;i<5;i++){
    for(int j=0;j<=i;j++){
        System.out.print(i+" ");
    }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java 
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java  
0
1 1
2 2 2
3 3 3 3
4 4 4 4 4

for(int i=0;i<5;i++){
    for(int j=0;j<=i;j++){
        System.out.print(j+" ");
    }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java 
0 
0 1
0 1 2
0 1 2 3
0 1 2 3 4

for(int i=5;i>0;i--){
    for(int j=0;j<i;j++){
    System.out.print(" * ");
    }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java 
 *  *  *  *  * 
 *  *  *  *
 *  *  *
 *  *
 *
 
for(int i=5;i>0;i--){
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java 
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
    }
    for(int k=0;k<2*i+1;k++){
            System.out.print("*");
        }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java
5
    *
   ***
  *****
 *******
*********

for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    }
    for(int k=0;k<2*n-(2*i+1);k++){
        System.out.print("*");
    }
    System.out.println("");
}
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> javac square.java
PS C:\Users\abhij\Desktop\core-java-dsa-practice\DSA\patterns> java square.java
5
*********
 *******
  *****
   ***
    *


 */