package keerthi;

public class Polymorphism {
void myMethod(String name) {
	System.out.println(name);
}
void myMethod(int a,int b) {
	System.out.println((a+b));}
void myMethod(int n) {
	System.out.println((n+n));
}
public static void main(String[] args) {
	Polymorphism obj=new Polymorphism();
	obj.myMethod(5);
	obj.myMethod("Keerthi");
	obj.myMethod(10, 20);
}
	
}

