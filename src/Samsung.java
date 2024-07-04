public class Samsung extends Phone{
    public Samsung(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("*** 폰 켜지는 중 ***");
    }
}
