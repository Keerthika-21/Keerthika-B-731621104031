package keerthi;

public class Constructor {
	
	Constructor(String name) {
		System.out.println(name);
	}
	Constructor(int a,int b) {
		System.out.println((a+b));}
	Constructor(int n) {
		System.out.println((n+n));
	}
	public static void main(String[] args) {
		Constructor  obj1=new Constructor("keerthi");
		Constructor obj2=new Constructor(10,20);
		Constructor obj3=new Constructor(5);
	}
		
	}



