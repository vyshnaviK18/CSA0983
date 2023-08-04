import java.util.*;

class triangle{
	public static void main(String args[]){
		int s1,s2,s3,ch;

	bool isrig(int s1,int s2,int s3){
	if((s1*s1)+(s2*s2)==(s3*s3)){
		return true;
	}
	else{
		return false;
	}
		
	};
bool issca(int a1,int b1, int c1){
	if((a1!=b1 && a1!=c1)){
		return true;
	}
	else{
		return false;
	}
};
void isiso(int a2,int b2, int c2){
	if(a2==b2 && a2!=c2){
		return true;
	}
	else{
		return false;
	}
};
void iseqi(int a3,int b3, int c3){
	if(a3==b3 && a3==c3){
		System.out.println("YES");
	}
};

		Scanner obj=new Scanner(System.in);
		System.out.println("side1=");
		s1=obj.nextInt();
		System.out.println("side2=");
		s2=obj.nextInt();
		System.out.println("side3=");
		s3=obj.nextInt();
		System.out.println("Enter the choice(1-is right angled triangle\n 2- is Scalene triangle\n3- is Isocelenes triangle \n 4- is equilateral=");
		ch=obj.nextInt();
		if(ch==1){
			System.out.println("is it right angled"+isrig(s1,s2,s3));		
		}
		else if(ch==2){
			System.out.println("is it right angled"+issca(s1,s2,s3));		
		}
		else if(ch==3){
			System.out.println("is it right angled"+isisc(s1,s2,s3));		
		}
		else if(ch==4){
			System.out.println("is it right angled"+iseqi(s1,s2,s3));		
		}
		else{
			System.out.println("wrong input");		
		}
	}
}