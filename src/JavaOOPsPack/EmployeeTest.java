/*package JavaOOPsPack;

public class EmployeeTest {
	public static void main(String[] args)
	{
	 Employee empobj1 = new Employee();
	 empobj1.InsertEmpRecord(100,"Ravi","Simplilearn");
	 empobj1.displayEmpRecord();

	  Employee empobj2 = new Employee();
	  empobj2.InsertEmpRecord(101,"Anindita","Simplilearn");
	  empobj2.displayEmpRecord();

	   Employee empobj3 = new Employee(); 
	   empobj3.empid = 102;
	   empobj3.empname = "Anita";
	   empobj3.company = "Samsung";
	   empobj3.displayEmpRecord();

	   Employee empobj4 = new Employee();
	   empobj4.displayEmpRecord(); //for int - specify 0 and string  //null
	  
	}


}*/

package JavaOOPsPack;

public class EmployeeTest {
	public static void main(String[] args)
	{
	 Employee empobj1 = new Employee();
	 empobj1.InsertEmpRecord(100,"Ravi","Simplilearn");
	 empobj1.displayEmpRecord();

	  Employee empobj2 = new Employee(101,"Anindita","Simplilearn");
	 // empobj2.InsertEmpRecord(101,"Anindita","Simplilearn");
	  empobj2.displayEmpRecord();

	   Employee empobj3 = new Employee(); 
	   empobj3.empid = 102;
	   empobj3.empname = "Anita";
	   empobj3.company = "Samsung";
	   empobj3.displayEmpRecord();

	   Employee empobj4 = new Employee();
	   empobj4.displayEmpRecord(); //for int - specify 0 and string  //null
	   

	   Employee empobj5 =new Employee(104,"Rohit");
	   empobj5.displayEmpRecord();
	  
	}


}