public class Main {
    public static void main(String[] args) {
        System.out.println(health(20, 23));
        System.out.println(health(2, -21));
        System.out.println(health(87, -16));
        System.out.println(health(55, 11));
        System.out.println(health(64, 5));

    }

    public static String health(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
}
