import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            //traverse the bits of n from right to left and fill the array from right to left.
            int ar [ ] = new int [32];
            for(int i = 0;i<32;i++)
            {
                // if last bit is 0 then place 0 at first of array
                if(n%2==0)
                    ar[i]=0;
                else
                    ar[i]=1;
                n=n>>1;
            }
            String str ="";
            for(int i =0;i<32;i++)
            {
                str+= Integer.toString(ar[i]);
            }
            long ans = Long.parseLong(str,2);
            System.out.println(ans);
        }
    }
}