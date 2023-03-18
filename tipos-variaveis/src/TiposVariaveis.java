public class TiposVariaveis {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Olá mundo em pt-br");

        System.out.println("O resto da divisão 18 por 3 é: "+ verificaModulo(18, 3));

        double resultado = (10*7) + (20/4);
        int divisaoInteira = 15/2;
        System.out.println("Resultado: "+resultado);
        System.out.println("Divisão inteira e 15 por 2: "+divisaoInteira);
    }

    public static int verificaModulo(int a, int b){
        return a & b;
    }
}
