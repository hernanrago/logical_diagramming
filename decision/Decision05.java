class Decision05 {
    int cantidad;
    double precio;
    double descuento;

    public static void main(String[] args){
        Decision04 d = new Decision04();

        d.cantidad = Integer.valueOf(args[0]);
        d.precio = Double.valueOf(args[1]);
        if(d.cantidad * d.precio > 1000 && d.cantidad * d.precio < 2000) d.descuento = d.cantidad * d.precio * 0.10;
        if(d.cantidad * d.precio > 2000) d.descuento = d.cantidad * d.precio * 0.20;

        System.out.printf("El comercio adquirió %d productos a $%.2f%n.", d.cantidad, (d.precio * d.cantidad)-d.descuento);
    }
}
