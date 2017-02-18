package lesson5.homework;


import lesson5.homework.interfaces.Calculate;

public class EmploeeMain {
    public static void main(String[] args) {
        Employee [] emp ={

                new SalariedEmployee("Andriy","w5555", 25, 161),
                new SalariedEmployee("Mariana","w2222", 24, 160),
                new ContractEmployee("Petro", "we454545", 3500),
                new ContractEmployee("Ivan", "we454545", 4500)
        };

        Employee tmp;
        for (int  i = 0; i<emp.length; i++) {
            for (int j = i+1; j <emp.length ; j++) {
                if (((Calculate)emp[i]).calculatePay() > ((Calculate)emp[j]).calculatePay()){
                    tmp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = tmp;
                }
            }
        }

        for (Employee employee: emp) {
            System.out.println(employee.getEmployeeID() + "\t" + employee.getName()
                    + "\t" + ((Calculate)employee).calculatePay() );
        }
    }
}
