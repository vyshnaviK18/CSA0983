import java.util.*;
class Triangle
{
void boolean_isRight(int a,int b,int c) {
if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
{
System.out.println("Right angled triangle");
}
else
{
System.out.println("Not a Right angled triangle");
}
};
void boolean_isScalene(int a,int b,int c) {
if((a != b) && (a != c) && (b != c))
{
System.out.println("Scalene triangle");
}
else
{
System.out.println("Not a Scalene triangle");
}
}; 
void boolean_isIsosceles(int a,int b,int c) {
if((a == b && a != c) || (a == c && a != b) ||(b == c && b != a))
{
System.out.println("Isosceles triangle");
}
else
{
System.out.println("Not an Isosceles triangle");
}
};
void boolean_isEquilateral(int a,int b,int c) {
if((a == b) && (a == c))
{
System.out.println("Equilateral triangle");
}
else
{
System.out.println("Not a Equilateral triangle");
}
};
}
class istriangle 
{
public static void main(String args[]) 
{   
Triangle x=new Triangle();
x.boolean_isRight(3,4,5);
x.boolean_isScalene(5,7,5);
x.boolean_isIsosceles(2,3,2);
x.boolean_isEquilateral(6,6,6);
}
}