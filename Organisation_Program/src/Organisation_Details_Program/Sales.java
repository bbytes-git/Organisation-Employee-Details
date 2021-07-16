package Organisation_Details_Program;

public class Sales extends Employees{

    protected int numberOfSales;
    protected String EmployeeID = "CHEL5232176";

    public Sales(String name, int Salary, String DOB, int numberOfSales) {

        this.name = name;
        this.Salary = Salary;
        this.DOB = DOB;
        this.numberOfSales = numberOfSales;

    }

    public void information()
    {
        System.out.println(name + " is a Salesperson who has a salary of £"+Salary+" and was born on " + DOB + " " + name +" delivered: " + numberOfSales + " sales this week " + name + "'s Employee ID: " + EmployeeID);
    }
}
