package lesson5.homework;

import lesson5.homework.interfaces.Calculate;

public class ContractEmployee extends Employee implements Calculate {

    private String federalTaxIdmember;
    private int monthlyPayment;


    public ContractEmployee(String name, String federalTaxIdmember, int monthlyPayment) {
        super(name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public int calculatePay() {
        int salary = monthlyPayment;
        return salary;
    }
}
