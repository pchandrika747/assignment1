import java.util.*;
class hasttable
{
public static void main(String args[])
{
Hashtable<Integer,Integer> n=new Hashtable<Integer,Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("enter  size");
int size=sc.nextInt();
System.out.println("Enter eliments into hashtable");
for(int i=0;i<size;i++)
{
int key=sc.nextInt();
int salary=sc.nextInt();
n.put(key,salary);
}
System.out.println("Hash Table elimenst"+n);
System.out.println("Enter a eliment to search");
int m=sc.nextInt();
int x,b;
if(n.containsKey(m))
{
x=n.get(m);
b=x+5000;
n.replace(m,b);
}
else
{
System.out.println("not found");
}

System.out.println(n);
}
}
