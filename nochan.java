import java.util.*;
import java.lang.Math;
class change
{
public static void main(String arg[])
{
int n,x,y,rem,re;
int s=0;
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a digit ");
n=sc.nextInt();
System.out.println("enter which no replace ");
x=sc.nextInt();
System.out.println("Enter value to replace  ");
y=sc.nextInt();
while(n!=0)
{
 rem=n%10;
 re=n/10;
if(rem==x)
{
rem=y;
}
s=s+rem*(int)Math.pow(10,c);
c+=1;
n=re;
}
System.out.println("number is"+s);
}
}
