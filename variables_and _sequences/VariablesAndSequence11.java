import static java.lang.Double.valueOf;

class VariablesAndSequence11 {

  public static void main(String[] args) {
    System.out.printf("Swimming pool of %s x %s x %s cm. needs %.4f liters or %.4f gallons of water to be filled up.%n", args[0], args[1], args[2], (Double.valueOf(args[0]) * Double.valueOf(args[1]) * Double.valueOf(args[2]) * 0.001), (Double.valueOf(args[0]) * Double.valueOf(args[1]) * Double.valueOf(args[2]) * 0.000264172));
  }
}
