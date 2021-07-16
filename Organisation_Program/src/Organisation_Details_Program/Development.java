package Organisation_Details_Program;

public class Development extends Employees{

    protected int numProjectsDelivered;
    protected String DevelopmentID = "LISA2457410";

    public Development(String name, int Salary, String DOB, int numProjectsDelivered) {

        this.name = name;
        this.Salary = Salary;
        this.DOB = DOB;
        this.numProjectsDelivered = numProjectsDelivered;

    }

    public void information()
    {
        System.out.println(name + " works as a Developer and has a salary of £"+Salary+" and was born on " + DOB + " " + name + "'s department delivered: " +
                numProjectsDelivered + " projects this week " + name + "'s Employee ID: " + DevelopmentID);

    }
}
