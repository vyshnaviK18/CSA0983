import java.util.*;

class methodsarea{
	int area(int a){
		return (a*a);
	}
	float area(float b){
		return (b*b);
	}
	float area(int c, float d){
		return (c*d);
	}
	float area(float e, float f){
		return (e*f);
	}
}

class poly{
public static void main(String args[]){
	methodsarea m = new methodsarea();
	System.out.println("Area="+m.area(88));
	System.out.println("Area="+m.area(88.8f));
	System.out.println("Area="+m.area(88,99.9f));
	System.out.println("Area="+m.area(88.8f,99.9f));

	}
}