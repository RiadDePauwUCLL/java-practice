package NoBoring;

public class NoBoring {
    public static int noBoringZeros(int n) {
      String str = Integer.toString(n);
      str = str.replaceAll("0*$", "");
      return str.isEmpty() ? 0 : Integer.parseInt(str); //ternary operation, shorter if-else operation.
    }
}