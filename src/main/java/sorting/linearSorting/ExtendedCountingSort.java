package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa do Counting Sort vista em sala. Desta vez este
 * algoritmo deve satisfazer os seguitnes requisitos:
 * - Alocar o tamanho minimo possivel para o array de contadores (C)
 * - Ser capaz de ordenar arrays contendo numeros negativos
 */
public class ExtendedCountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	private int encontraMaior(Integer[] array, int left, int right){
		int maior = array[left];
		for(int i = left + 1; i <= right; i++){
			if(array[i] > maior){
				maior = array[i];
			}
		}
		return maior;
	}

	private int encontraMenor(Integer[] array, int left, int right){
		int menor = array[left];
		for(int i = left + 1; i <= right; i++){
			if(array[i] < menor){
				menor = array[i];
			}
		}
		return menor;
	}

}
