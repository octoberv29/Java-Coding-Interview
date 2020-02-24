import java.util.Arrays;

/*

    Recursion - is an approach to solving problems using a function that calls itself as a subroutine.
                It should have two properties:
                1. a base case (or cases) - a terminating scenario so that recursion 
                                            doesn't result in an infinite loop.
                2. recurrence relation - reduces all other cases towards the base case

        Memoization - is an optimization technique used primarily to speed up computer programs 
                    by storing the results of expensive function calls and returning 
                    the cached result when the same inputs occur again.

            - For example, for Fib numbers we can provide a hashtable with stored prev values

        Time Complexityty: the number of recursion invocations * the time complexity of one invocation
    
        - Sometimes it's easier to draw an execution tree to calculate this (Fibonachi sequence).
        The time complexity will be equal to the number of nodes in the tree (O(2^n-1) in Fib)
        Using the Memoization this will be reduced to O(n) for Fib
    

        Space Complexity: 
        - recursion related space: 
            - the returing address fo the function call
            - parameters that are passed to the function
            - local variables within the function
        - non-recursion related space:
            - memoization

    
        Tail recursion
    
    Divide-and-Conquer - works by recursively breaking the problem down into two or more subproblems 
                         of the same or related type, until these subproblems become simple enough 
                         to be solved directly. Then one combines the results of subproblems 
                         to form the final solution.
                         
                         1. Divide: divide the problem S into a set of subproblems
                         2. Conquer: solve each problem recursively                 
                         3. Combine: combine the results of each subproblem


        Merge Sort - sorting algorithm that uses divide-and-conquer paradigm.
            1. Divide the given unsorted list into several sublists
            2. Sort each of the sublists recursively
            3. Merge the sorted sublists to produce new sorted list

            - Time: O(Nlog(N)), N - the length of the input
            - Space: O(N), N - the length of the input


            It can be top-down and bottom-up:

            1. Top-Down (recursion):
                Divide the list into TWO SUBLISTS
                Recursively sort the sublists 
                Merge the sorted sublists repeatedly to obtain the final list of sorted elements

            2. Bottom-up (iterative): 
                Divie the list into SUBLISTS OF SINGLE ELEMENTS
                Each of the sublists is then sorted already
                Merge the sublists, two at a time, until a single list remains

        
        
        Quick Sort - sorting algorithm that uses divide-and-conquer paradigm. 
                     It can be 2-3 times faster than the merge sort.
            
            1. Partitioning: choose a pivot and divide a list into two sublists, one for
                             values grater than pivot, another - less.
            2. Recursively sort two sublists
            3. Concatenate




    Backtracking

*/


public class algo_recursion {

    // Top-Down approach
    public class MergeSort {

        public int [] merge_sort(int[] input) {
            if (input.length <= 1) return input;

            int pivot = input.length / 2;
            int length = input.length;

            int [] lhs = merge_sort(Arrays.copyOfRange(input, 0, pivot));
            int [] rhs = merge_sort(Arrays.copyOfRange(input, pivot, length));
            return merge(lhs, rhs);
        }

        public int[] merge(int[] lhs, int[] rhs) {
            int[] result = new int[lhs.length + rhs.length];
            int left=0, right=0, i=0;

            while (left < lhs.length && right < rhs.length) {
                if (lhs[left] < rhs[right]) {
                    result[i++] = lhs[left++]; 
                } else {
                    result[i++] = rhs[right++];
                }
            }

            // append what is remain the above lists
            while (left < lhs.length) {
                result[i++] = lhs[left++];
            }
            while (right < rhs.length) {
                result[i++] = rhs[right++];
            }

            return result;
        }
    }

}