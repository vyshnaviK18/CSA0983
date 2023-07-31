import java.util.*;

class empgrade{
	public static void main(String args[]){
		int sal,grade;
		double bon =0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter grade(1-A/2-B)=");
		grade= obj.nextInt();
		System.out.println("Enter salary=");
		sal= obj.nextInt();
		if(sal>10000){
			if(grade==1){
				bon=sal*0.05;
			}
			else{
				bon=sal*0.1;
			}
		}
		else{
			if(grade==1){
				bon=sal*0.07;

			}
			else{
				bon=sal*0.12;
			}
		}
		System.out.println("salary="+sal);
		
		System.out.println("Bonus="+bon);
		System.out.println("total="+(bon+sal));
	}
}
		