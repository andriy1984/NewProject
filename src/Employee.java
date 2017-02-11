
public class Employee {

    private String name;
    private float rate;
    private float hours;
    private static float totalHours;

    public Employee(){
    }

    public Employee(String name, float rate){
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, float rate, float hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        Employee.totalHours += hours;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        Employee.totalHours -= this.hours;
        this.hours = hours;
        Employee.totalHours += hours;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    // calculate methotds

    public float salary (){
        return rate * hours;
    }

    public float bonuses (){
        return salary() * 0.5f;
    }

    //change the rate of employee

    public void changeRate (float rate) {
        this.rate = rate;
    }

    //output information about employee
    @Override
    public String toString(){

        return "[ Name: " + getName() + ", hours: " + getHours() + ", rate: " +
                getRate() + ", salary: "+ salary() + ", bonus: " + bonuses()+" ]";
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setRate(8.5f);
        emp1.setHours(42.5f);
        Employee emp2 = new Employee("Petro", 11.3f);
        emp2.setHours(55.5f);
        Employee emp3 = new Employee("Taras", 12.0f, 50.0f);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println("Total hours: " + totalHours);
    }

}
