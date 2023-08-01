import java.util.*;
class pp{
	int x=10;
	public void display(){
		System.out.println(x);
	}
}
class cc extends pp{
	int x=5;
	public void display1(){
		System.out.println(x);
	}
}
class gg extends pp{
	int x=0;
	public void display2(){
		System.out.println(x);
	}
}
class hinherit
{
	public static void main(String args[])
	{
		gg g= new gg();
		g.display2();
		g.display();
		cc c= new cc();
		c.display1();
		c.display();
	}
}