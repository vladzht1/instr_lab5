import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке dev");

        // 1
        System.out.println(factorial(1));

        // 25
        System.out.println(factorial(5));
    }

    private static int factorial(int num) {
        if (num <= 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
