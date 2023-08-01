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
class system
{
	public static void main(String args[])
	{
		cc c= new cc();
		c.display1();
		c.display();
	}
}