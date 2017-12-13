package employeeClass;
class MainclassE 
{
  public static void  main(String[] args) 
   {
   	  System.out.println("*******************************************************");
   	  
   	  Employee e1 = new Employee(545153,"SAHIL SHANGHAAI",1000000000);
   	  System.out.println("Emp id:"+e1.getId());
   	  System.out.println("Emp name:"+e1.getName());
   	  System.out.println("Emp Salary:"+e1.getSalary());
   	  System.out.println("_________________________________________________________");
   	  
   	  Employee e2 = new Employee(52,"Wasim",54423243);
   	  System.out.println(e2.getName());

   	  System.out.println(e2.getId());
   	  System.out.println(e2.getSalary());
   }
}
