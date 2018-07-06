class Decision09 {
    double base;
    int personas;
    double precioPersona;
    double precio;

    Decision09 (int personas){
        this.personas = personas;
        base = 3000.00;
        if(personas > 25){
            if(personas < 36) precioPersona = 45.00;
            else precioPersona = 40.00;
        } else precioPersona = 50.00;
        precio = base + (personas * precioPersona);
    }

    public static void main(String[] args){
        Decision09 d = new Decision09(Integer.valueOf(args[0]));

        System.out.printf("El precio total de la excursión es de $%.2f por %d personas.%n", d.precio, d.personas);
    }
}
