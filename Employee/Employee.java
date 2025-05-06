public class Employee{
  String name;
  int id;
  double Salary;
  public Employee(String name, int id, double Salary) {
    this.name = name;
    this.id = id;
    this.Salary = Salary;
  }  
  public void displayInfo(){
    System.out.println("Employee ID: " +id);
    System.out.println("Employee Name: " +name);
    System.out.println("Employee Salary: " + Salary);

  }
  public static void main(String[] args) {
    //Creating an object of Employee
    Employee emp1 = new Employee("XYZ", 101, 50000.0);
    emp1.displayInfo();
  }
}