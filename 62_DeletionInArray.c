#include<stdio.h>
void deletion(int a[],int p,int val,int n)
{
    int i;
    for(i=p-1;i<n-1;i++)
       a[i]=a[i+1];
}
int main()
{
    int a[50],n,p,val,i;
    printf("Limits=");
    scanf("%d",&n);
    printf("Elements=");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("position=");
    scanf("%d",&p);
    printf("value=");
    scanf("%d",&val);
    deletion(a,p,val,n);
    for(i=0;i<n-1;i++)
    {
        printf("%d\n",a[i]);
    }
    return 0;
}
