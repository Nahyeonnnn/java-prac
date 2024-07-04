public class IPhone extends Phone{

    public IPhone(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
