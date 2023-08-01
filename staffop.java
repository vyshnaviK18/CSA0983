import java.util.*;
class staff{
	int code=909;
	String name="Gulu";
	public void display(){
		System.out.println("\tcode="+code);
		System.out.println("\tname="+name);
	}
}
class teacher extends staff{
	String sub="java";
	String pub="java book";
	public void display1(){
		System.out.println("\tsubject="+sub);
		System.out.println("\tpublications="+pub);
	}
}
class typist extends staff{
	int speed=100;
	public void display2(){
		System.out.println("\tspeed="+speed);
	}
}
class officer extends staff{
	char gr='A';
	public void display3(){
		System.out.println("\tGrade="+gr);
	}
}
class regular extends typist {
	int sal=10000;
	public void display4(){
		System.out.println("\tsalary="+sal);
	}
}
class casual extends typist{
	int dal=100;
	public void display5(){
		System.out.println("\tdaily wages="+dal);
	}
}
class staffop
{
	public static void main(String args[])
	{
		System.out.println("Regular");
		regular g= new regular();
		g.display4();
		g.display2();
		g.display();
		System.out.println("casual");
		casual h= new casual();
		h.display5();
		h.display2();
		h.display();
		System.out.println("teacher");
		teacher i = new teacher();
		i.display1();
		i.display();
		System.out.println("officer");
		officer j = new officer();
		j.display3();
		j.display();

	}
}