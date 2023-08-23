import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String str = "";

        if (a % 5 == 0) {
            str += "a=" + a + ", ";
        }
        if (b % 5 == 0) {
            str += "b=" + b + ", ";
        }
        if (c % 5 == 0) {
            str += "c=" + c + ", ";
        }

        if (!str.isEmpty()) {
            str = str.substring(0, str.length() - 2);
            System.out.println(str);
        } else {
            System.out.println("нет значений, кратных 5");
        }

        System.out.println("a / b = " + (a / b));
        System.out.println("a / b = " + ((float) a / b));

        int r_ceil = (int) Math.ceil((float) a / b);
        System.out.println("Округленние до ближайшего целого в большую сторону: " + r_ceil);

        int r_floor = (int) Math.floor((float) a / b);
        System.out.println("Округленние до ближайшего целого в меньшую сторону: " + r_floor);

        int r_round = Math.round((float) a / b);
        System.out.println("Округленние до ближайшего целого математическим округлением: " + r_round);

        System.out.println("b % c = " + (b % c));

        int min = Math.min(a, b);
        System.out.println("Минимальное значение из a и b: " + min);

        int max = Math.max(b, c);
        System.out.println("Максимальное значение из b и c: " + max);
    }
}