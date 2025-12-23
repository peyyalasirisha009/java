class Sort
{
public static void main(String args[])
{
int a[]={23,32,14,11,18,14};
int i,j;
for(i=0;i<a.length;i++)
for(j=i+1;j<a.length;j++)
if(a[i]>a[j])
{
int tmp=a[i];
	a[i]=a[j];
	a[j]=tmp;
}
System.out.print("Sorted element are");
for(i=0;i<a.length;i++)
System.out.println(a[i]+" ");
}
}
