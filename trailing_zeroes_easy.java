//https://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
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

            long count = 0; //initializing result

            // Keep dividing n by powers
            // of 5 and update count
            for (long i = 5; i<=n ; i = (long)5*i)
                count += n / i;
            System.out.println(count);

        }
    }
}