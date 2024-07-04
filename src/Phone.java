abstract public class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    abstract public void turnOn();
}
