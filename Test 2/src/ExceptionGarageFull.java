public class ExceptionGarageFull extends Exception {
    private int maxCapacity;

    public ExceptionGarageFull(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }
}
