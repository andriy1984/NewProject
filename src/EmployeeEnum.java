import java.util.Scanner;

public class EmployeeEnum {

    private String name;
    private String departament_name;
    private float salery;

    public enum Department{
        IT, FINANCE, HR
    }
    Department department;
    //Getter
    public String getName() {
        return name;
    }

    public EmployeeEnum(){}

    public EmployeeEnum(String name, String departament_name, float salery) {
        this.name = name;
        this.departament_name = departament_name;
        this.salery = salery;
    }

    public String getDepartament_name() {
        return departament_name;
    }

    public float getSalery() {
        return salery;
    }

    //Setter


    public void setName(String name) {
        this.name = name;
    }

    public void setDepartament_name(String departament_name) {
        this.departament_name = departament_name;
    }

    public void setSalery(float salery) {
        this.salery = salery;
    }

    public void getDepartament(String dep){
        switch (dep) {
            case "IT":
                department = Department.IT;
                break;
            case "Finance":
                department = Department.FINANCE;
                break;
            case "HR":
                department = Department.HR;
                break;
            default:
                System.out.println("No this departament = [" + dep + "]");
                System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Employee[" +
                "name='" + name + '\'' +
                ", departament name='" + departament_name + '\'' +
                ", salery=" + salery +
                ']';
    }

    public static void main(String[] args) {
        EmployeeEnum[] employee = {
                new EmployeeEnum("Ivan", "IT", 1200),
                new EmployeeEnum("Petro", "HR", 1000),
                new EmployeeEnum("Nazar", "Finance", 1100),
                new EmployeeEnum("Andrii", "IT", 1400),
                new EmployeeEnum("Mariana", "IT", 1300)
        };

        //all employees of a certain department
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter department name:");
        String dep = scanner.next();
        for (EmployeeEnum h:employee) {
            h.getDepartament(dep);
            if (h.getDepartament_name().equals(dep)){
                System.out.println(h);
                }
        }
        //arrange workers by the field salary in the ascending and descending order
        System.out.println("the ascending order :");
        EmployeeEnum tmp;
        for (int  i = 0; i<employee.length; i++) {
            for (int j = i+1; j <employee.length ; j++) {
                if (employee[i].getSalery()>employee[j].getSalery()){
                    tmp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = tmp;
                }
            }
        }
        for (EmployeeEnum h:employee) {
            System.out.println(h);
        }

        System.out.println("the descending order :");
        for (int  i = 0; i<employee.length; i++) {
            for (int j = i+1; j <employee.length ; j++) {
                if (employee[i].getSalery()<employee[j].getSalery()){
                    tmp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = tmp;
                }
            }
        }
        for (EmployeeEnum h:employee) {
            System.out.println(h);
        }

    }
}
