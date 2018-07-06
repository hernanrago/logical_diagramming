class VariablesAndSequence08 {

  public static void main(String[] args) {
      double dollar = Double.valueOf(args[0]) * 0.036;
      double euro = Double.valueOf(args[0]) * 0.030;

    System.out.format(args[0] + " argentine pesos are %.3f american dollars and %.3f euros.", dollar, euro);
  }
}
