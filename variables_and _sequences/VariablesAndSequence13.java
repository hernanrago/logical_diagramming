class VariablesAndSequence13 {

  public static void main(String[] args) {
    double startingPrice = Double.valueOf(args[0]);
    double discount = startingPrice * Double.valueOf(args[1]) / 100.00;
    double iva = (startingPrice - discount) * 0.21;
    double finalPrice = startingPrice - discount + iva;

    System.out.printf("Starting price = $%10.2f%nDiscount = %-20.2f%nIVA $%.2f%nFinal price = $%.2f%n", startingPrice, discount, iva, finalPrice);
  }
}
