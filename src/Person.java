public class Person {
    private String name;
    private Phone phone;

    public Person(String name) {
        this.name = name;
    }

    //휴대폰 구매
    public void buyPhone(Phone phone) {
        this.phone = phone;
        System.out.println(name + "님이 " + this.phone.getModel() + "을 구매했습니다.");
    }

    //휴대폰 켜기
    public void turnOnPhone() {
        if(this.phone != null) {
            System.out.println(name + "님이 " + this.phone.getModel() + "을 켰습니다.");
            this.phone.turnOn();
        }
        else
            System.out.println("휴대폰부터 사셈..");
    }
}
