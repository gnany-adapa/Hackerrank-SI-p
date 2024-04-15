import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for( int temp=0;temp<t;temp++)
        {
           String str = "";
           int n = sc.nextInt();
            if(n==0)
                str= "0";

            while(n>0)
            {
                //if(n%2==1) also same
                if((n&1)==1) //if remainder is 1 then prepend 1 at beginning
                { 
                    str = "1"+str;
                }
                else  // if remainder is 0 then prepend 0 at beginning
                {
                    str = "0"+str;
                }
                n=n>>1;//also similer to n = n/2;
            }
            System.out.println(str);
        }
    }
}