package keerthi;

 class employee {
int employeeId;
String employeeName;
float employeeSalary;
//constructor
employee(int employeeId,String employeeName,float employeeSalary){
this.employeeId=employeeId;
this.employeeName=employeeName;
this.employeeSalary=employeeSalary;
}
//method
void display() {
	System.out.println("Employee Id :"+employeeId);
	System.out.println("Employee Name:"+employeeName);
	System.out.println("Employee Salary:"+employeeSalary);
}
}
public class object{
	public static void main(String[]args) {
		employee emp1=new employee(01,"Naveen",50000.0f);
		emp1.display();
		employee obj2=new employee(02,"keerthi",30000.0f);
		obj2.display();
	
	
		
	
}
}
;