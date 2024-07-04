public class Main {
    public static void main(String[] args) {
        Person jobs = new Person("잡스");
        Person jaeYong = new Person("재용");
        IPhone applePhone = new IPhone("애플폰");
        Samsung samsungPhone = new Samsung("삼송폰");

        jobs.buyPhone(applePhone);
        jobs.turnOnPhone();

        System.out.println();

        jaeYong.buyPhone(samsungPhone);
        jaeYong.turnOnPhone();
    }
}