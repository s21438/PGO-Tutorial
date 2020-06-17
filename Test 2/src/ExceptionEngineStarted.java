public class ExceptionEngineStarted extends Exception {
    private boolean engineOn;

    public ExceptionEngineStarted(boolean engineOn){
        this.engineOn = engineOn;
    }
}
