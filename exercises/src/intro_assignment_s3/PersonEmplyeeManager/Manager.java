package intro_assignment_s3.PersonEmplyeeManager;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, String jobTitle, double salary, double bonus) {
        super(name, age, jobTitle,salary);
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return super.pay() + bonus;
    }
}
