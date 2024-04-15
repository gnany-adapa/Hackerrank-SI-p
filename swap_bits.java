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
            int ar [ ] = new int [32];
            //using an array to store 32 bit representation of the number n
            for(int i = 31;i>=0;i--)
            {
                if(n%2==0)
                    ar[i]=0;
                else
                    ar[i]=1;
                n=n>>1;
            }
            //swapping bits from right to left
            for(int i= 31;i>0;i=i-2)
            {
                int temp = ar[i];
                ar[i]=ar[i-1];
                ar[i-1]=temp;
            }
            String str ="";
            for(int i =0;i<32;i++)
            {
                //to convert integer to string this is mandatory
                str+= Integer.toString(ar[i]);
            }
            //parseInt or parseLong convert string to integer or long respectively.
            long ans = Long.parseLong(str,2);
            System.out.println(ans);
        }
    }
}