// I have neither given nor received unauthorized aid on this piece of work.

public class Main {
    public static void main(String[] args) {
        // 1. Add method with two integers
        int sum1 = add(3, 8);
        System.out.println("Sum 1: " + sum1);

        // 2. Add method with four integers
        int sum2 = add(3, 8, 4, 9);
        System.out.println("Sum 2: " + sum2);

        // 3. Morning greeting method
        String morningMessage = morningGreeting("Toby Fox");
        System.out.println(morningMessage);

        // 4. Afternoon greeting method
        String afternoonMessage = afternoonGreeting("Mac Miller");
        System.out.println(afternoonMessage);

        // 5. Triple method
        String tripledString = triple("oohbaby");
        System.out.println("Tripled String: " + tripledString);

        // 6. Half method
        double halfValue1 = half(8);
        System.out.println("Half Value 1: " + halfValue1);

        double halfValue2 = half(17);
        System.out.println("Half Value 2: " + halfValue2);

        // 7. Round positive value to nearest integer method
        int roundedPositive1 = roundPositiveValueToNearestInteger(8.5);
        System.out.println("Rounded Positive Value 1: " + roundedPositive1);

        int roundedPositive2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println("Rounded Positive Value 2: " + roundedPositive2);

        // 8. Round negative value to nearest integer method
        int roundedNegative1 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println("Rounded Negative Value 1: " + roundedNegative1);

        int roundedNegative2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println("Rounded Negative Value 2: " + roundedNegative2);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3, int num4) {
        int sum1 = add(num1, num2);
        int sum2 = add(num3, num4);
        return add(sum1, sum2);
    }

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    public static String triple(String string) {
        return string + string + string;
    }

    public static double half(int num) {
        return num / 2.0;
    }

    public static int roundPositiveValueToNearestInteger(double num) {
        return (int) (num + 0.5);
    }

    public static int roundNegativeValueToNearestInteger(double num) {
        return (int) (num - 0.5);
    }
}
