import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        
        while(t>0)
        {
            int count=0;
            long n = sc.nextLong();
            String str = Long.toBinaryString(n);
            while(n>0)
            {
                if((n&1)==1)
                    count++;
                n=n>>1;
            }
            System.out.println(count);
            t--;
        }
    }
}