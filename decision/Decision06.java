class Decision06 {
    double ofertaMayor;

    double buscarMayorOferta(double[] ofertas){
        for(double i : ofertas) {
            if(i > ofertaMayor) ofertaMayor = i;
        }
        return ofertaMayor;
    }

    public static void main(String[] args){
        Decision06 d = new Decision06();

        double[] ofertasRecibidas = new double[args.length];

        for(int i = 0; i < args.length; i++){
            ofertasRecibidas[i] = Double.valueOf(args[i]);
        }

        double ofertaMayor = d.buscarMayorOferta(ofertasRecibidas);

        System.out.printf("La mayor oferta es %.2f.%n", ofertaMayor);
    }
}
