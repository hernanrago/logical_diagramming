class Decision12 {
    int peso;
    String destino;
    double precioTotal;

    Decision12 (int peso, String destino){
        this.peso = peso;
        this.destino = destino;
        if(peso <= 15){
            switch(destino){
                case "CABA": precioTotal = peso * 20.00; break;
                case "Microcentro": precioTotal = peso * 15.00; break;
                case "Gran Buenos Aires": precioTotal = peso * 30.00; break;
                case "Patagonia": precioTotal = peso * 60.00; break;
                case "resto del pais": precioTotal = peso * 50.00; break;
                case "America": precioTotal = peso * 200.00; break;
                case "Europa": precioTotal = peso * 200.00; break;
                case "resto del mundo": precioTotal = peso * 300.00; break;
            }
        }

    }

    public static void main(String[] args){
        Decision12 d = new Decision12(Integer.valueOf(args[0]), args[1]);

        System.out.printf("El precio del envío del paquete de %d kg. a %s es de $%.2f.%n", d.peso, d.destino, d.precioTotal);
    }
}
