import java.io.*;
import java.util.*;

public class Solution {
    public static long hcf(long a,long b){
        if(a==0)//
            return b;
        if(b==0)
            return a;
        if(a>b)
            return hcf(a%b,b);
        else
            return hcf(a,b%a);
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int test=0;test<t;test++){
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();
            long h=hcf(a,b);
            long l=(a*b)/h;
            System.out.println(l+" "+h);
        }
    }
}