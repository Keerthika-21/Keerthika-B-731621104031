import java.util.*;
class cat{
 void makeSound(){
System.out.println("meow");
}
}
class Dog{
void makesounds(){
System.out.println("barking");}
}
public class Method{
public static void main(String[] args){
Dog dg1=new Dog();
cat dg=new cat();
dg.makeSound();
dg1.makesounds();
}
}