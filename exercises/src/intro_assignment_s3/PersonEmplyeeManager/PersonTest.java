package intro_assignment_s3.PersonEmplyeeManager;

public class PersonTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Anders", 30, "Developer",40000);
        Manager manager = new Manager("Bo", 45, "Team Lead", 50000, 10000);

        System.out.println(employee.getName() + " is paid: " + employee.pay());
        System.out.println(manager.getName() + " is paid: " + manager.pay());
    }
}
