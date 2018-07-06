class Decision11 {
    int horas;
    double precioHorasIniciales = 40.00;
    double precioHorasIntermedias = 30.00;
    double precioHorasAvanzadas = 25.00;
    double precioTotal;

    Decision11 (int horas){
        this.horas = horas;
        if(horas <= 2) precioTotal = horas * precioHorasIniciales;
        if(horas > 2 && horas <= 5) precioTotal = (2 * precioHorasIniciales) + ((horas - 2) * precioHorasIntermedias);
        if(horas > 5 && horas <=10) precioTotal = ((horas - 5) * precioHorasAvanzadas) + (2 * precioHorasIniciales) + (3 * precioHorasIniciales);
        if(horas > 10 && horas <24) precioTotal = 300.00;
        if(horas == 24) precioTotal = 500.00;
    }

    public static void main(String[] args){
        Decision11 d = new Decision11(Integer.valueOf(args[0]));

        System.out.printf("El precio total de la estadia es $%.2f.%n", d.precioTotal);
    }
}
