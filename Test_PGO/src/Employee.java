import java.util.ArrayList;

public class Employee {
    private static ArrayList<Employee> EMPLOYEES = new ArrayList<>();
    private static int EMPLOYEES_COUNTER = 0;
    private String id;
    private String name;
    private String surname;
    private String login;
    private boolean activated = false;
    private ArrayList<Subordinate> subordinates = new ArrayList<>();

    public Employee(String name, String surname, String login) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        EMPLOYEES_COUNTER++;
        this.id = "Number " + EMPLOYEES_COUNTER;
        activated = false;
    }

    public Employee(String surname) {
        this.surname = surname;
        EMPLOYEES_COUNTER++;
        this.id = "p" + EMPLOYEES_COUNTER;
        activated = false;
    }

    public boolean isActive() {
        return activated;
    }

    public void activate(){
        this.activated=true;
    }
    public void deactivate(){
        this.activated=false;
    }



    public void addSubordinate(Subordinate subordinateName) {
    }
    this.subordinates.add(subordinateName);

    public static void DisplayInfoAboutActiveEmployees() {
        for (Employee d : EMPLOYEES) {
            if (d.activated) {
                d.displayInfo();
            }
        }
    }

    public void displayInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(this + "\n");
        for (String s : subordinates) {
            builder.append(s + "\n");
        }
        System.out.println(builder.toString());
    }

}