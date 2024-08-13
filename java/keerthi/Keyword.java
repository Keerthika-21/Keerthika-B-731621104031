package keerthi;

public class Keyword {
String name;
Keyword(String name){
	this(10,20);
	this.name=name;
	this.greeting();
}
Keyword(int a,int b){
	System.out.println("Addition:"+(a+b));
}
void greeting() {
	System.out.println(name);
	
}
public static void main(String[] args) {
	Keyword obj=new Keyword("keerthi");
}
}

