#include<stdio.h>
void insertion(int a[],int p,int val,int n)
{
    int i;
    for(i=n-1;i>p-1;i++)
       a[i+1]=a[i];
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
    insertion(a,p,val,n);
    for(i=0;i<n;i++)
    {
        printf("%d\n",a[i]);
    }
    return 0;
}
