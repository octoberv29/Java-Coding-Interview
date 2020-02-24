/*
    1.  Recursion: Сколькими способами можно доссумировать до определенного числа используя 1 и 2.

        helper(int i, int n) {
            if (i > n) return 0;
            if (i == n) return 1;
            return helper(i+1, n) + helper(i+2, n);
        }

        Можно добавить memoization, создав array размера n+1

        helper(int i, int n, int[] memo) {
            if (i > n) return 0;
            if (i == n) return 1;
            if (memo[i] > 0) return memo[i];
            memo[i] = helper(i+1, n, memo) + helper(i+2, n, memo);
            return memo[i];
        }
        
    2. Recursion: часто можно легко понять алгоритм, нарисовав дерево    
    
    3.  Когда нужно постоянно менять числа внутри коллекции на другие (например 1 на 10, и 0 на 01),
        то создай HashMap c ключами 1 и 0, и потом доставай их занчения.

    4.     




*/