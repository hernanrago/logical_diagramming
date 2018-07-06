class Decision04 {
    int cantidad;
    double precio;
    double descuento;

    public static void main(String[] args){
        Decision04 d = new Decision04();

        d.cantidad = Integer.valueOf(args[0]);
        d.precio = Double.valueOf(args[1]);
        if(d.cantidad > 100) d.descuento = d.cantidad * d.precio * 0.15;

        System.out.printf("El comercio adquirió %d productos a $%.2f%n.", d.cantidad, (d.precio * d.cantidad)-d.descuento);
    }
}
