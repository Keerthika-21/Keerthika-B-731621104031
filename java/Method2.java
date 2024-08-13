import java.util.*;
class vehicle{
 void car(){
System.out.println("My new car");
}
}
class drive{
void repair(){
System.out.println("Repairing a car");}
}
public class Method2{
public static void main(String[] args){
vehicle dg1=new vehicle();
drive dg=new drive();
dg.repair();
dg1.car();
}
}