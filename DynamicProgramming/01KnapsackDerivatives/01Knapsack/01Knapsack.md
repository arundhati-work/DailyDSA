# 0-1 Knapsack Problem

Find [this problem](https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card) on GeeksForGeeks.

You are given the weights and values of items, and you need to put these items in a knapsack of capacity `capacity` to achieve the maximum total value in the knapsack. Each item is available in only one quantity.

In other words, you are given two integer arrays `val[]` and `wt[]`, which represent the values and weights associated with items, respectively. You are also given an integer `capacity`, which represents the knapsack capacity. Your task is to find the maximum sum of values of a subset of `val[]` such that the sum of the weights of the corresponding subset is less than or equal to `capacity`. You cannot break an item; you must either pick the entire item or leave it (0-1 property).

**Examples:**
```
Input: capacity = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1] 
Output: 3
Explanation: Choose the last item, which weighs 1 unit and has a value of 3.
```

```
Input: capacity = 3, val[] = [1, 2, 3], wt[] = [4, 5, 6] 
Output: 0
Explanation: Every item has a weight exceeding the knapsack's capacity (3).
```

```
Input: capacity = 5, val[] = [10, 40, 30, 50], wt[] = [5, 4, 6, 3] 
Output: 50
Explanation: Choose the second item (value 40, weight 4) and the fourth item (value 50, weight 3) for a total weight of 7, which exceeds the capacity. Instead, pick the last item (value 50, weight 3) for a total value of 50.
```

## Thought Process

- "To include, or not to include, that is the question." - ~~Prince Hamlet~~ _Arundhati, 2025_
- Given an element at index `i` in `wt[]` and `val[]`, if `wt[i] <= capacity`, we have the option to either include the item or not include it (to get the maximum profit)
- If `wt[i] > capacity` we definitely don't include it
- So through recursion we find, through both possibilities, the maximum possible profit

## Possible Approaches to Problem

> Note: **n** = size of arrays wt[] and val[] which will be equal

### 1. Pure Recursive Solution
**Time:** O(2^n)
- For each element we make 2 choices (include/exclude)
- Forms a binary tree of height n
- Will lead to `Time Limit Exceeded`

**Space:** O(n)

- Due to recursion stack depth
- At any time, stack goes n levels deep

### 2. Recursive with Memoization
**Time:** O(n * capacity)
- We fill dp array of size n*capacity
- Each cell computed exactly once

**Space:** O(n * capacity)
- O(n * capacity) for dp array
- O(n) for recursion stack
- Overall O(n * capacity)

### 3. **Top-down (Iterative DP)** - Best Solution
**Time:** O(n * capacity)
- Two nested loops for dp array
- Each cell computed once

**Space:** O(n * capacity)
- Only dp array needed
- No recursion stack
- Slightly better than memoization in practice
