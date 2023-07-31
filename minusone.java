import java.util.*;

class minusone
{
public static void main(String args[])
{
int i,p=0,pa=0,n=0,na=0,nu=0,s=0,sp=0;
Scanner obj = new Scanner(System.in);
while(nu!=-1){
System.out.println("Enter=");
nu=obj.nextInt();

if(nu>0){
p+=nu;
pa++;
}
else if (nu<-1){
n-=nu;
na++;
}
else{
s=0;
break;
}
}
sp=p/pa;
s=n/na;
System.out.println("AVG of Positive number="+sp);
System.out.println("AVG of Negative number=-"+s);
}
}
