class Decision07 {
    double peso;
    double altura;
    double indiceMasaCorporal;
    String estado;

    Decision07 (double peso, double altura){
        this.peso = peso;
        this.altura = altura;
        indiceMasaCorporal = this.peso / Math.pow(this.altura, 2);
        if(indiceMasaCorporal < 18.5) estado = "bajo";
        if (indiceMasaCorporal > 18.4 && indiceMasaCorporal < 26) estado = "normal";
        if(indiceMasaCorporal > 25) estado = "alto";
    }

    public static void main(String[] args){
        Decision07 d = new Decision07(Double.valueOf(args[0]), Double.valueOf(args[1]));

        System.out.printf("El paciente pesa %.2f kg, mide %.2f m, y su indice de masa corporal es %.2f. Su peso es %s.%n", d.peso, d.altura, d.indiceMasaCorporal, d.estado);
    }
}
