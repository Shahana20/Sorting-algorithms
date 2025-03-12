## Selection Sort Algorithm

1. Start with the first element of the list.
2. Iterate through the array to find the smallest element in the **unsorted part**.
3. Swap the found smallest element with the first element in the **unsorted part**.
4. Move to the next element and repeat steps 2-3 until the list is fully sorted.

### Time Complexity: O(n²)
### Space Complexity: O(1) 

## Dry Run
**Initial List:**  
[&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp; 5 3 1 4 2&nbsp;]  
&nbsp;**Sorted**   &nbsp;&nbsp;**Unsorted**

1. **First Iteration:**
   - The initial list is: `[5 3 1 4 2]`.
   - **Find the smallest element** in the unsorted part `[5 3 1 4 2]`. The smallest element is `1`.
   - **Swap `1` with the first element `5`**.
   - List after the first iteration: `[1 | 3 5 4 2]`.

2. **Second Iteration:**
   - The current list is: `[1 3 5 4 2]`.
   - **Find the smallest element** in the unsorted part `[3 5 4 2]`. The smallest element is `2`.
   - **Swap `2` with the second element `3`**.
   - List after the second iteration: `[1 2 | 5 4 3]`.

3. **Third Iteration:**
   - The current list is: `[1 2 5 4 3]`.
   - **Find the smallest element** in the unsorted part `[5 4 3]`. The smallest element is `3`.
   - **Swap `3` with the third element `5`**.
   - List after the third iteration: `[1 2 3 | 4 5]`.

4. **Fourth Iteration:**
   - The current list is: `[1 2 3 4 5]`.
   - **Find the smallest element** in the unsorted part `[4 5]`. The smallest element is `4`.
   - No swap is needed since `4` is already in its correct position.
   - List after the fourth iteration: `[1 2 3 4 | 5]`.

5. **Fifth Iteration:**
   - The current list is: `[1 2 3 4 5]`.
   - **Find the smallest element** in the unsorted part `[5]`. The smallest element is `5`, and it's already in its correct position.
   - No swap is needed.
   - Final sorted list: **`[1 2 3 4 5 ]`**.

