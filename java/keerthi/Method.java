package keerthi;

public class Method {
void myMethod1() {
	System.out.println("Instance Method");
	
}
static void myMethod2() {
	System.out.println("static method");
	
}
public static void main(String[] args) {
	Method obj=new Method();
	obj.myMethod1();
	Method.myMethod2();
}
}
