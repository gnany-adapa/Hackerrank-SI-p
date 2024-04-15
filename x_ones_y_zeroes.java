import java.io.*;
import java.util.*;

public class Solution {
    static final long MOD = 1000000007;

    //below function calculates x^n, lets assume we're calculating 3^6;
    // 6's binary representation is                 1    1   0
    // while iteration x value updates as follows   3^4 3^2 3^1  moving from right to left and making x=x*x;
    // when bit is set we multiply ans with that value at that bit like 3^2 etc.
    public static long power(long x, long n) {
        long ans = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans = (ans * x) % MOD;
            }
            x = (x * x) % MOD;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long sum = ((power(2, x) - 1) * power(2, y)) % MOD;
            //2^3 -1 = 111
            //if we multiply a number with 2^y it implies the left shift by y bits.
            System.out.println(sum);
        }
    }
}