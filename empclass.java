import java.util.*;

class employee{
	int empno,basicpay;
	double hra,ta,da,pf,lic,ns,ded,gs;
	String empname;
	public void getinput(){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter employee name=");
		empname=obj.nextLine();
		System.out.println("Enter employee number=");
		empno=obj.nextInt();
		System.out.println("Enter basic pay=");
		basicpay=obj.nextInt();
	};

	public void cal(){
		hra=basicpay*0.10;
		ta=basicpay*0.20;
		da=basicpay*0.15;
		pf=basicpay*0.12;
		lic=basicpay*0.20;
		ns=basicpay+hra+ta+da;
		ded=pf+lic;
		gs=ns-ded;
		System.out.println("NET SALARY="+ns);
		System.out.println("DEDUCTION ="+ded);
		System.out.println("GROSS SALARY="+gs);
	};
}

class empclass{
	public static void main(String args[]){
		employee x=new employee();
		x.getinput();
		x.cal();
	}
}

	