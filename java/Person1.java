import java.util.*;
public class Person1{
String name;
Person1(String name){
this(21);
this.name=name;
this.greeting();
}
Person1(int a){
System.out.println("Age:"+a);
}
void greeting(){
System.out.println(name);
}
public static void main(String[] args){
Person1 obj=new Person1("Keerthi");
}
}