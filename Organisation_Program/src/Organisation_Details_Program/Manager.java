package Organisation_Details_Program;

public class Manager extends Employees{

    protected int NumDepartments;
    protected int  EmployeesOverseeing;
    protected String ManagerID = "TONI7439375";

    public Manager(String name, int Salary, String DOB, int NumDepartments, int EmployeesOverseeing) {

        this.name = name;
        this.Salary = Salary;
        this.DOB = DOB;
        this.NumDepartments = NumDepartments;
        this.EmployeesOverseeing = EmployeesOverseeing;


    }
    @Override
    public void information()
    {
        System.out.println(name +" " + "is a Manager who has a salary of: £"+Salary+" and was born on: " + DOB + " " + name + " oversees: " + NumDepartments + " Departments " + name + "'s Employee ID: " + ManagerID);
    }
}
