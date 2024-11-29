public class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        System.out.println("Это добавлено в ветке dev");

        // 1
        System.out.println(factorial(1));

        // 25
        System.out.println(factorial(5));
    }

    private static int factorial(int num) {
        if (num <= 0) {
            System.out.println(num + " is not positive, return 0");
            return 1;
        }

        System.out.println(num + " is positive, recursion");
        return num * factorial(num - 1);
    }
}
