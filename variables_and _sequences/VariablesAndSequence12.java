class VariablesAndSequence12 {

  public static void main(String[] args) {
    int minutes = Integer.valueOf(args[0]);
    int price = Integer.valueOf(args[1]);
    int hours = minutes / 60;
    int totalTime = hours;

    if(minutes % 60 != 0) totalTime = hours + 1;

    System.out.printf("For %d hours %d minutes, the driver has to pay $%.2f. %n", hours, (minutes - (hours * 60)), Double.valueOf(totalTime * price));
  }
}
