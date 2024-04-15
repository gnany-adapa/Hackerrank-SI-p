import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int te=1;te<=t;te++)
        {
            System.out.println("Test Case #"+te+":");
            int n = sc.nextInt();
            int ar [][] = new int [n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    ar[i][j]= sc.nextInt();
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=n-1;j>=0;j--)
                {
                    System.out.printf("%d ",ar[j][i]);
                }
                System.out.println();
            }
        }
    }
}