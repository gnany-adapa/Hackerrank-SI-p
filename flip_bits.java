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
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(a>0 || b>0)
            {
                count = count + ( (a&1)!=(b&1)?1:0);
                a>>=1;
                b>>=1;
            }
            
            System.out.println(count);
            t--;
        }
    }
}