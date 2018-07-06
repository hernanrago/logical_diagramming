class VariablesAndSequence15 {

  public static void main(String[] args) {
    //args[0] = km.
    //args[1] = liters of gasoline

    System.out.printf("The driver drove %.2f km. per gasoline liter.%n"
    , Double.valueOf(args[0]) / Double.valueOf(args[1]));
  }
}
