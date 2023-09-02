import java.util.Scanner;
class alpha
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.print("Enter any Character: ");
char ch=s.next().charAt(0);
int l_count=0,u_count=0,num_count=0;
while (ch!='*')
{
if(ch>='A'&&ch<='Z')
{
 u_count++;
}
if(ch>='a'&&ch<='z')
{
 l_count++;
}
if(Character.isDigit(ch))
{
num_count++;
}
System.out.print("Enter any Character: ");
ch=s.next().charAt(0);
}
System.out.println("Total count of lower case: "+l_count);
System.out.println("Total count of upper case: "+u_count);
System.out.println("Total count of numbers: "+num_count);
}
}
