public class algo_searching {

    // Time: O(log(n)), Space: O(1)
    // O(log(n)) because we always divide the array into two halfs
    public int binary_seacrh(int[] array, int target) { // sorted array
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == target) return middle;
            else if (array[middle] < target) left = middle + 1;
            else if (array[middle] > target) right = middle - 1;
        }

        return -1;
    }
}