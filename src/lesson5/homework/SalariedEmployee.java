package lesson5.homework;


import lesson5.homework.interfaces.Calculate;

public class SalariedEmployee extends Employee implements Calculate {

    private String socialSecurityNumber;
    private int rate;
    private int hours;


    public SalariedEmployee(String name, String socialSecurityNumber, int rate, int hours) {
        super(name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public int calculatePay() {
        int salary = rate * hours;
        return salary;
    }


}
