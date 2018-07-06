class Decision03 {

    int invitados;
    int limiteMesa;
    int mesas;

    public static void main(String[] args){
        Decision03 d = new Decision03();

        d.invitados = Integer.valueOf(args[0]);
        d.limiteMesa = Integer.valueOf(args[1]);
        d.mesas = d.invitados / d.limiteMesa;

        System.out.printf("Para %d invitados se necesitan %d mesas de %d personas cada una y una de %d personas.%n", d.invitados, d.mesas, d.limiteMesa, (d.mesas * d.limiteMesa) - d.invitados);
    }
}
