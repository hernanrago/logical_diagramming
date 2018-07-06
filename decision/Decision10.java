class Decision10 {
    int minutos;
    double precioMinutosIniciales = 0.60;
    double precioMinutosIntermedios = 0.50;
    double precioMinutosAvanzados = 0.40;
    double precioTotal;
    String internacional;
    double adicionalInternacional = 0.40;

    Decision10 (int minutos, String internacional){
        this.minutos = minutos;
        this.internacional = internacional;
        if(minutos <= 5) precioTotal = minutos * precioMinutosIniciales;
        if(minutos > 5 && minutos <=15) precioTotal = (5 * precioMinutosIniciales) + (minutos - 5 * precioMinutosIntermedios);
        if(minutos > 15) precioTotal = (minutos - 15 * precioMinutosAvanzados) + (5 * precioMinutosIniciales) + (10 * precioMinutosIntermedios);
        if(internacional.equals("si")) precioTotal += (minutos * adicionalInternacional);
    }

    public static void main(String[] args){
        Decision10 d = new Decision10(Integer.valueOf(args[0]), args[1]);

        System.out.printf("El precio total de la llamada de %d minutos es $%.2f.%n", d.minutos, d.precioTotal);
    }
}
