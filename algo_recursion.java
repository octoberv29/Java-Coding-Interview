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
    
    Divide and Conquer

    Backtracking

    Master Theorem


*/