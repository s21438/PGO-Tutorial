public class Employee extends Person {
    int hireDate;
    String companyName;
    double salaryFields;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salaryFields) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salaryFields = salaryFields;
    }
    public double getSalary() {
        return salaryFields;
    }
    public int getJobSeniority() {
        return 2020-this.hireDate;
    }
}
