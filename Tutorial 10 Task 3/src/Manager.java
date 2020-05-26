public class Manager extends Employee {
    double bonusField;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salaryFields, double bonusField) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salaryFields);
        this.bonusField = bonusField;
    }

    @Override
    public double getSalary() {
        return salaryFields+bonusField;
    }

    @Override
    public String toString() {
        return " Manager with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();
    }
}
