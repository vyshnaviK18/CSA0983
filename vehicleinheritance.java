import java.util.*;

class Vehicle{
    public String make,model;
}

class Sedan extends Vehicle{
    int year;
    int km;
    
    Sedan(String x,String y,int a,int b){
        make=x;
        model=y;
        year=a;
        km=b;
    }
    void print(){
        System.out.println("MAKE="+make);
        System.out.println("MODEL="+model);
        System.out.println("YEAR="+year);
        System.out.println("KM="+km);
    }
}
class SUV extends Vehicle{
    int year1;
    int n;
    
    SUV(String i,String j,int c,int d){
        make=i;
        model=j;
        year1=c;
        n=d;
    }
    void print(){
        System.out.println("MAKE="+make);
        System.out.println("MODEL="+model);
        System.out.println("YEAR="+year1);
        System.out.println("KM="+n);
    }
}

class vehicleinheritance{
    public static void main(String args[]){
        Sedan s= new Sedan("mt","m1",2003,234);
        s.print();
        SUV sa= new SUV("pt","m2",2008,4);
        sa.print();
    }
}
