import java.util.*;
class method
{
static void primenumber(int x,int y) 
{
int twincount=0;
for(int i=x;i<=y;i++)
{
int count=0;

for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;

}
}

if(count==2)
{

twincount++;
}
}
System.out.println("Twin count ="+twincount/2);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Starting range=");
int n=sc.nextInt();
System.out.print("Enter Ending range=");
int p=sc.nextInt();
primenumber(n,p);
}
}