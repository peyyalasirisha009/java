import java.util.Scanner;
Class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter the value::");
int n=sc.nextInt();
int tmp,rem=0,sum=0,num=0;
tmp=n;
while(tmp>0)
{
num=num+1;
tmp=tmp/10;
}
tmp=n;
while(tmp>0)
{
rem=tmp%10;
sum=sum+Math.pow(rem,num);
tmp=tmp/10;
}
if(n==sum)
System.out.println(n+"is Armstrong");
else 
System.out.println(n+"is not Armstrong");
}
