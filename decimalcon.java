import java.util.*;

class decimalcon{
	public static void main(String args[]){
		int a,b,n=100,i=0,j=0,k,rem,reem;
		int bin[]= new int[n];
		int oct[]=new int[n];
		Scanner obj= new Scanner(System.in);
		System.out.println("ENTER=");
		a=obj.nextInt();
		b=a;
		while(a != 0)   
		{  
			bin[i]=a%2;
			a=a/2;
			i+=1; 
			
		}  
		while(b != 0)   
		{ 
			oct[j]=b%8;
			b= b/8;  
			j+=1; 
			
		}  
		for(k=i;k<=0;k++){
			System.out.print("\n"+bin[k]);
		}
		for(k=0;k<=j;k++){
			System.out.print("\n"+oct[k]);
		}
	}
}