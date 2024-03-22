package PipeIteration;

public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int min = numbers[0];
    int max = numbers[numbers.length - 1];
    int[] fixed = new int[max - min + 1];
    for (int i = 0; i < fixed.length; i++) {
      fixed[i] = min + i;
    }
    return fixed;
    }
}