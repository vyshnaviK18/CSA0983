//perfect number or harshad number checking

import java.util.*;

class perfectnum{
	public static void main(String args[]){
		int n,i,s=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter=");
		n=obj.nextInt();
		for(i=1;i<=n/2;i++){
			if(n%i==0){
				s+=i;
			}
		}
		if(n==s){
			System.out.println("The given number is perfect number");
		}
		else{
			System.out.println("The given number is not a  perfect number");
		}
	}
}