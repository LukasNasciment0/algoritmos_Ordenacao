

public abstract class ArraysAbstrato {

    public ArraysAbstrato(){};

    public abstract void ordenar(int[] v);

    public static void assertions(){

    }

    public static int[] pegaArray(int numeroDoArray){
        
        int[] arrayVazio = new int[]{};
        int[] arrayComUmElemento = new int[]{1};
        int[] arrayDecrescente = new int[]{5, 4, 3, 2, 1, 0};
        int[] arrayDecrescenteComNegativos = new int[]{5, 4, 3, 2, 1, 0, -1, -2};
        int[] arrayDecrescenteImpar = new int[]{6, 5, 4, 3, 2, 1, 0};
        int[] arrayDecrescentePar = new int[]{6, 5, 4, 3, 2, 1, 0};
        
        return switch (numeroDoArray) {
            case 1 -> arrayVazio;
            case 2 -> arrayComUmElemento;
            case 3 -> arrayDecrescente;
            case 4 -> arrayDecrescenteComNegativos;
            case 5 -> arrayDecrescenteImpar;
            case 6 -> arrayDecrescentePar;
            default -> new int[]{0,0,0};
        };
    }

    public void swap(int[] v, int indexA, int indexB){
        int balde = v[indexA];
        v[indexA] = v[indexB];
        v[indexB] = balde;
    }

    private static int[] transformaEmInt(String[] entrada){
        int[] saida = new int[entrada.length];
        for (int i = 0; i < entrada.length - 1; i++)
            saida[i] = Integer.parseInt(entrada[i]);
        return saida;
    }

}
