/*TO FIND THE MISSING NUMBER WE USED AN EFFICIENT METHOD WHERE WE FIND EXPECTED SUM AND THE SUM OF ARRAY ELEMENTS. THE DIFFERENCE IS THE MISSING NUMBER. FOR SUM OF FIRST N NATURAL NUMBERS, SUM = N*N+1/2; FOR N+1 NATURAL NUMBERS: 
EXP SUM= (N+1)*(N+1 +1)/2;
MISSING NUMBER = EXPSUM-TOTALSUM;
*/


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int t = scanner.nextInt();

        while (t-- > 0) 
        {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum=0;

            for (int i = 0; i < n; i++) 
            {
                arr[i] = scanner.nextInt();
                sum+=arr[i];
                
            }
            int ex= (n+1)*(n+2)/2;
            System.out.println(ex-sum);
            
            
        }
    }
}
 