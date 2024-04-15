#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    long long int t,n;
    long long int arr[64];
    arr[0]=1;
    for(int i=1;i<64;i++)
    {
        arr[i]=arr[i-1]*2;
    }
    scanf("%lld",&t);
    while(t--)
    {
        scanf("%lld",&n);
        int flag;
        flag=0;
        for(int i=0;i<64;i++)
        {
            if(arr[i]==n)
            {
                printf("True\n");
                flag=1;
                break;
                
            }
        }
        if(flag==0)
        {
            printf("False\n");
        }
    }
    return 0;
}
