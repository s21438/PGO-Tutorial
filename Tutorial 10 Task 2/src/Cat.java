public class Cat extends Animal{
    public Cat (String name) {
        super.Name = Name;
        super.type = type;

    }

    @Override
    public String getType() {
        return "Cat";
    }
    public void start() {
        System.out.println(getType() + " Cat Starts! ");
    }

    public void stop() {
        System.out.println(getType() + " Cat Stopped! ");
    }
}
