import java.util.*;


class marks{
public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	int i=0;
	int roll[]=new int[10];
	int s1[]=new int[10];
	int s2[]=new int[10];
	int s3[]=new int[10];
	int total[]=new int[10];
	for(i=0;i<10;i++){
		System.out.println("Enter roll no:");
		roll[i]=obj.nextInt();
		System.out.println("Enter marks in subject 1=");
		s1[i]=obj.nextInt();
		System.out.println("Enter marks in subject 2=");
		s2[i]=obj.nextInt();
		System.out.println("Enter marks in subject 3=");
		s3[i]=obj.nextInt();
	}
	for(i=0;i<10;i++){
		total[i]=s1[i]+s2[i]+s3[i];
		System.out.println("Roll no="+roll[i]+"total marks="+total[i]);
	}
	int max1=0,max2=0,max3=0,max4=0;
	int r1=0,r2=0,r3=0,r4=0;
	for(i=0;i<10;i++){
		if(max1<s1[i]){
			max1=s1[i];	
			r1=roll[i];
		}
	}
	for(i=0;i<10;i++){
		if(max2<s2[i]){
			max2=s2[i];
			r2=roll[i];
		}
	}
	for(i=0;i<10;i++){
		if(max3<s3[i]){
			max3=s3[i];
			r3=roll[i];
		}
	}
	for(i=0;i<10;i++){
		if(max4<total[i]){
			max4=total[i];
			r4=roll[i];
		}
	}
	System.out.println("Subject1="+max1+"roll no="+r1);
	System.out.println("Subject2="+max2+"roll no="+r2);
	System.out.println("Subject3="+max3+"roll no="+r3);
	System.out.println("total="+max4+"roll no="+r4);
	}
}
