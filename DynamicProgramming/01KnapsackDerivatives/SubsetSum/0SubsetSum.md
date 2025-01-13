# Subset Sum Problem

Find [this problem](https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1) on GeeksForGeeks.

Given an array `arr[]` containing `n` numbers and a value `sum`, return `true` if there is a subset in `arr[]` that sums up to `sum`, and `false` otherwise.

**Input:**
```
arr = [2, 3, 7, 8, 10]
sum = 11
```

**Output:**
```
True
```
**Explanation:**
```
3 + 8 = 11
Hence subset is possible
```

## Thought Process

- "To include, or not to include, that is the question." - ~~Prince Hamlet~~ _Arundhati, 2025_
- Given an element `e` in `arr[]`, if `e <= sum`, we have the option to either include it or not include it
- If `e > sum` we definitely don't include it
- So through recursion we find, through both possibilities, if a solution is possible

## Possible Approaches to Problem

### 1. Pure Recursive Solution
**Time:** O(2^n)
- For each element we make 2 choices (include/exclude)
- Forms a binary tree of height n
- Will lead to `Time Limit Exceeded`

**Space:** O(n)

- Due to recursion stack depth
- At any time, stack goes n levels deep

### 2. Recursive with Memoization
**Time:** O(n * sum)
- We fill dp array of size n*sum
- Each cell computed exactly once

**Space:** O(n * sum)
- O(n * sum) for dp array
- O(n) for recursion stack
- Overall O(n * sum)

### 3. **Top-down (Iterative DP)** - Best Solution
**Time:** O(n * sum)
- Two nested loops for dp array
- Each cell computed once

**Space:** O(n * sum)
- Only dp array needed
- No recursion stack
- Slightly better than memoization in practice
