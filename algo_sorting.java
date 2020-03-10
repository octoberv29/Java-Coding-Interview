/*
    Bubble sort: O(n^2)
    Insertion sort: O(n^2)
    Selection sort: O(n^2)


*/



public class algo_sorting {
    



    /* 
        Bubble sort:
            We iterate over the array and check if the current item is smaller than the next item.
            If it is, we move on to the next item; otherwise we swap the current and the next item. 
            When we finish one iteration, we iterate again and again untill we reach the point 
            when no changes has made to the array.

        Time: O(n^2), best case when the array is sorted -> O(n)
        Space: O(1) because we do swaps in place    
    */
    public int[] bubble_sort(int[] array) {
        boolean wasSwap = true;
		int counter = 0;
		
		while (wasSwap) {
			wasSwap = false;
			for (int i=0; i<array.length-counter; ++i) {
				if (i != array.length-1 && array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					wasSwap = true;
				}
			}
			counter++;
		}
			
        return array;
    }

    /*
        Insertion sort:
            We iterate over the array starting from the second item and compare this item to the previous
            items and swap them if needed. It works like sorting the deck of cards.
        
        Time: O(n^2)
        Space: O(1)
    */
    public int[] insertion_sort(int[] array) {
        for (int i=1; i<array.length; ++i) {
			int j=i;
			while (j>0 && array[j] < array[j-1]) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
			}
		}
        return array;
    }


    /*
        Selection Sort:
        Time: O(n^2)
        Space: O(1)

    */
    public int[] selection_sort(int[] array) {
        int j=0;
		while (j < array.length) {
			int min_i = j;
			for (int i=j+1; i<array.length; ++i) {
				if (array[i] < array[min_i]) min_i = i;
			}
			int temp = array[j];
			array[j] = array[min_i];
			array[min_i] = temp;
			j++;
		}
        return array;
    }

}