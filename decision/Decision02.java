class Decision02 {
    public static void main(String[] args){
        int seconds = Integer.valueOf(args[0]);
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;

        System.out.printf("%d seconds are %d minutes, %d hours and %d days.%n", seconds, minutes, hours, days);
    }
}
