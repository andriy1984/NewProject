package lesson5.homework;

public class Employee {

    private static int ID = 0;
    private String name;
    private int employeeID;

    public Employee( String name) {
        this.name = name;
        employeeID = ID + 1;
        ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int getEmployeeID() {
        return employeeID;
    }

}
