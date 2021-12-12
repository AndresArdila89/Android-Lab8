package models;

public class Teacher extends Person{

    private Double salary;
    private double commission;
    private String company;

    public Teacher(int id, String name, String picture,  double salary, double commission, String company) {
        super(id, name, picture);
        this.salary = salary;
        this.commission = commission;
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void work() {
        super.setRoll("Teacher");
    }
}
