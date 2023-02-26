
public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getWorkHours() {
        return workHours;
    }


    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }


    public int getHireYear() {
        return hireYear;
    }


    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    private double tax(){
        double tax;
        if(salary <= 1000 && salary > 0){
            tax = 0;
        }
        else{
            tax = (salary * 3) / 100;
        }

        return tax;
    }

    private double bonus(){
        double bonus;
        double hour = workHours - 40;

        if(hour > 0){
            bonus = hour * 30;
        }
        else{
            bonus = 0;
        }
        return bonus;
    }

    private double raiseSalary(){
        double raise;
        int currentYear = 2023, year = currentYear - hireYear;
    
        if(year < 10){
            raise = 0.05;
        }
        else if(year < 20){
            raise = 0.1;
        }
        else{
            raise = 0.15;
        }

        return salary * raise;
    }

    public void calculate(){
        System.out.println(toString());

        double beforeRaise = salary + bonus() - tax();
        double newSalary = salary + raiseSalary() + bonus() - tax();
        
        System.out.println("Tax : " + tax() + "\n"
        + "Bonus : " + bonus() + "\n"
        + "Raise : " + raiseSalary() + "\n"
        + "Salary with taxes and bonuses : " + beforeRaise + "\n"
        + "New Salary without taxes and bonuses : " + newSalary);
        salary = newSalary;  
    }




    @Override
    public String toString() {
        return "name = " + this.name + "\n" + "salary = " + this.salary + "\n"
        + "workHours = " + this.workHours + "\n" +"hireYear = " + this.hireYear;
    }

    

    

    
}
