public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("Christan", "Musu", "cmusu1");
        Employee emp2=new Employee("Andrea", "Meloni", "ameloni1");
        Employee emp3=new Employee("Luca", "Rossi", "lrossi1");
        Employee emp4=new Employee("Michele", "Moro", "mmoro1");
        Employee emp5=new Employee("Oscar", "Pintori", "opintori1");
        Employee emp6=new Employee("Leonardo", "Da Vinci", "ldavinci1");


        emp1.addSubordinate(new Subordinate("Michele", "Moro"));
        emp2.addSubordinate(new Subordinate("Oscar", "Pintori"));
        emp3.addSubordinate(new Subordinate("Marta", "Cadau"));


        //emp1.removeSubordinate("Michele");
        //emp4.addSubordinate("Carlo");
       emp1.displayInfo();
        emp3.activate();
        emp1.activate();
        emp2.activate();
        emp4.activate();
        emp2.deactivate();
        Employee.DisplayInfoAboutActiveEmployees();
    }
}
