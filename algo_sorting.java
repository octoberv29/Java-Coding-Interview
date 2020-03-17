import java.util.Arrays;

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

    /*
        Quick Sort:
        Time: Average: O(nlog(n)) Worst: O(n*2)
        Space: O(log(n))
    */
    public static void quickSort(int start, int end, int[] array) {
		if (start >= end) return;
		
		int pivot = start;    // choose the first element as pivot
		int left = start + 1; // choose left index to iterate
		int right = end;      // choose right index to iterate
		
		while (left <= right) {
			if (array[left] > array[pivot] && array[right] < array[pivot]) {
				swap(left, right, array);
			}
			if (array[left] <= array[pivot]) left++;
			if (array[right] >= array[pivot]) right--;
		}
		 // swap the pivot with right (last element that is greater than pivot)
		swap(pivot, right, array);
		
		boolean isLeftSmaller = (right - 1) - start < end - (right + 1);
		if (isLeftSmaller) {
			quickSort(start, right - 1, array);
			quickSort(right + 1, end, array);
		} else {
            quickSort(right + 1, end, array);
            quickSort(start, right - 1, array);
		}
	}
	
	public static void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
    }
    


    /*
        Merge Sort:
        Time: O(nlog(n))
        Space: O(nlog(n))
    */

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) return array;
    
            int n = array.length;
            int middle = array.length / 2;
            
            int[] lhs = mergeSort(Arrays.copyOfRange(array, 0, middle));
            int[] rhs = mergeSort(Arrays.copyOfRange(array, middle, n));
            
        return merge(lhs, rhs);
    }
        
    public static int[] merge(int[] lhs, int[] rhs) {
        int[] result = new int[lhs.length + rhs.length];
        int left = 0, right = 0, i = 0;
        
        while (left < lhs.length && right < rhs.length) {
            if (lhs[left] < rhs[right]) {
                result[i++] = lhs[left++];
            } else {
                result[i++] = rhs[right++];
            }
        }
        
        while (left < lhs.length) {
            result[i++] = lhs[left++];
        }
        
        while (right < rhs.length) {
            result[i++] = rhs[right++];
        }
        
        return result;
    }



}