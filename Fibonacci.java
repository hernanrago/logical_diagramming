class Fibonacci {
    int op;
    int tot;
    int[] serie;

    int[] getNum(int size){
        op = 1;
        serie = new int[size];
        serie[0] = 0;
        for(int i = 1; i < serie.length; i++){
            tot += op;
            serie[i] = tot;
            op = serie[i];
        }
        return serie;
    }

    public static void main(String[] args){
        Fibonacci fibo = new Fibonacci();
        fibo.serie = fibo.getNum(Integer.valueOf(args[0]));
        for(int i : fibo.serie) System.out.println(i);
    }
}
