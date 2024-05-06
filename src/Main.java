import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String result = permission(20, 24.5);//1 задание
        System.out.println(result);

        String result2 = permission1(20, 40);//2 задание
        System.out.println(result2);

        System.out.println(permission1(20, 56));//3 задание
        System.out.println(permission1(30, 16));
        System.out.println(permission1(25, 46));
        System.out.println(permission1(20, 45));
        System.out.println(permission1(10, 54));

        int randomAge = generateRandomAge();// 4 задание
        System.out.println("случайный возраст: " + randomAge);

        String result3 = permission1(generateRandomAge(), 45);//5 задание
        System.out.println(result3);


    }


    public static String permission(int age, double temperature) {//1 задание
        return "возраст человека " + age + " лет,температура на улице " + temperature + " градусов";


    }

    public static String permission1(int age, double temperature) {// 2 задание
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }

    public static int generateRandomAge() {// 4 задание
        Random random = new Random(100);
        int randomAge = random.nextInt(100);
        return randomAge;
    }
}