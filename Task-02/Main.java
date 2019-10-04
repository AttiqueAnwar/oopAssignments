public class Main {
    public static void main(String[] args) {
        ClockDisplay c1 = new ClockDisplay();
        c1.setTime(11, 59, 30, "pm");

        System.out.println(c1.getTime());
        for (int i = 0; i <= 30; i++) {
            c1.timeTick();
            System.out.println(c1.getTime());
        }
    }
}