package Organisation_Details_Program;
// Author, Tonia B. Biokoro
// Email: b.biokoro@outlook.com

public class Main {

    public static void main(String[] args) {

        Employees[] employed = new Employees[3];
        employed[0] = new Development("Tina", 800000, "12/03/1994", 5);
        employed[1] = new Sales("Chelmsford", 70000, "12/02/1985", 4);
        employed[2] = new Manager("Lisa", 100000, "16/07/2000", 4, 30);

        for (Employees Organisation : employed) {
            Organisation.printDetails();
            Organisation.information();

        }
    }
}
