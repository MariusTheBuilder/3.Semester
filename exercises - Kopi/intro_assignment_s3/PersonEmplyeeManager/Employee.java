package intro_assignment_s3.PersonEmplyeeManager;

public class Employee extends Person {
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double pay() {
        return salary;
    }
}
