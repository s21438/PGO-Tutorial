public class User {
    private String Name;
    private String LastName;
    private String Email;
    private String Password;
    private String Type;

    public User(String Name, String LastName, String Email, String Password) {
        this.Name=Name;
        this.LastName=LastName;
        this.Email=Email;
        this.Password=Password;
        Type = "User account";
    }

    public User(String Email) {
        this.Email = Email;
        Type = "Guest account";
    }

    public User(){
        Type = "No user";
    }

    public void createUser(String Name, String LastName, String Password) {
        if(Type == "Guest account"){
            this.Name = Name;
            this.LastName = LastName;
            this.Password = Password;
            Type = "User account";
            System.out.println("Account with email:" + Email + " was changed!");
        }else {
            System.out.println("Account with email:" + Email + " is not guest!");
        }
    }

    public String getEmail() {
        return Email;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getType() {
        return Type;
    }
}

