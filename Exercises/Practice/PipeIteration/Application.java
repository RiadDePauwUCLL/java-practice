package PipeIteration;

public class Application {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        Kata.pipeFix(numbers);

        // the way to print out those numbers from int[]
        int[] fixedNumbers = Kata.pipeFix(numbers);
        for (int number : fixedNumbers) {
            System.out.println(number);
        }
    }
}
