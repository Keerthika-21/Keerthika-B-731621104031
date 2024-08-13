package keerthi;
class A{
	int a=10;
	A(String name){
		System.out.println("Welcome:"+name);
	}
	void myMethod() {
		System.out.println("i am a supper class method");
	}
	}
class B extends A{
	B(){
		super("shevak");
	}
	void myMethod2() {
		System.out.println("Super class variable:"+super.a);
		super.myMethod();
	}

	}

public class Myclass1{
	public static void main(String[] args) {
		B b=new B();
		b.myMethod2();
	}
}

