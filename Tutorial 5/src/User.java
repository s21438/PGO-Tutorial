public class User {
    public  String name;
    public String lastName;
    public String Email;
    public String password;

    User(String Name, String lastName, String Email, String Password)
    {
        this.name = Name;
        this.lastName = lastName;
        this.Email = Email;
        this.password =  Password;
    }

    User(String x)
    {
        this.name = "Guest Account";
        this.lastName = "Guest Account";
        this.Email = x;
        this.password = null;
    }

    User(User x, String y, String z, String p)
    {
        this.name = z;
        this.lastName = y;
        this.Email = x.Email;
        this.password = p;
    }


}
