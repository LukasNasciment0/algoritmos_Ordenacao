



/*
O SelectionSort compara cada 1 dos elementos com o restante do array
para descobrir o menor elemento e coloca-lo no inicio da entrada que compara
*/
public class SelectionSort extends ArraysAbstrato{

    private void selection(int[] v){
        
        for (int i = 0; i < v.length; i++){
            int indexMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] < v[indexMenor])
                    indexMenor = j;
            swap(v, i, indexMenor);
            }    
        }
    }

}
