package keerthi;

public class Variables {
	int b=20;
	static int c=30;
	public static void main(String[] argsd) {
		int a=10;
		System.out.println("Local Variable:"+a);
		Variables obj=new Variables();
		System.out.println(obj.b);
		System.out.println(Variables.c);
	}

}
