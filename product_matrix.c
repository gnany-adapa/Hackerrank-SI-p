#include<stdio.h>
#include<stdlib.h>



int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int i,j,m1,m2,n1,n2,l,t,k,a[100][100],b[100][100];

    scanf("%d",&t);
    for(l=0;l<t;l++)
    {
        scanf("%d %d",&m1,&n1);
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                scanf("%d",&a[i][j]);
            }
        }
        scanf("%d %d",&m2,&n2);
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
            {
                scanf("%d",&b[i][j]);
            }
        }
        int c[m1][n2];
        
        for(i=0;i<m1;i++)
        {
            
            for(j=0;j<n2;j++){
                
                c[i][j]=0;
                for(k=0;k<m2;k++)
                {
                    c[i][j]+= a[i][k]*b[k][j];
                }
                printf("%d ",c[i][j]);
            }
            printf("\n");

        }
    }
    return 0;
}
