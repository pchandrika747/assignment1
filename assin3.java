import java.util.*;
import java.lang.*;
class evod{
public static void main(String args[]){
int N,rem,r,s=0,d=0,even=0,odd=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
N=sc.nextInt();
while(N!=0)
{
rem=N%10;
r=N/10;
if(rem%2==0)
{
s=s*10+rem;
}
else
{
d=d*10+rem;
}
N=r;
}
while(s!=0 )
{
int re=s%10;
int f=s/10;
if(re%2==0 )
{
even=even*10+re;
}
s=f;
}
while(d!=0)
{
int re1=d%10;
int f1=d/10;
if(re1%2==1 )
{
odd=odd*10+re1;
}
d=f1;
}
System.out.println("even="+even);
System.out.println("Odd="+odd);
}
}