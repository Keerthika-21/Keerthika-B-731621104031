import java .util.*;
public class Main3{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number1");
int number1=sc.nextInt();

System.out.println("Enter a number2");
int number2=sc.nextInt();
if(number1<number2){
System.out.println("Number2 is larger:"+number2);
}
if(number1==number2){

System.out.println("Number is equal:"+number1);
}
else{
System.out.println("Number1 is smaller:"+number1);
}
}
}
