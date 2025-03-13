## Bubble Sort Algorithm

1. Start from the first element of the list.
2. Compare the current element with the next one and swap them if current element is greater than next element.
3. Move to the next pair and repeat step 2 till you reach the end of the list.
4. After each pass, the largest element bubbles up to its correct position.
5. Repeat the process for the remaining unsorted portion until the entire list is sorted.

### Time Complexity: O(n²)
### Space Complexity: O(1) 

## Dry Run
**Initial List:**  
[&nbsp;5 3 1 4 2&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;]  
&nbsp;**Unsorted**   &nbsp;&nbsp;**Sorted**

1. **First Pass:**
   - Compare `5` and `3` → swap → `[3 5 1 4 2]`
   - Compare `5` and `1` → swap → `[3 1 5 4 2]`
   - Compare `5` and `4` → swap → `[3 1 4 5 2]`
   - Compare `5` and `2` → swap → `[3 1 4 2 5]`
   - Largest element `5` is now in place.
   - List after first pass: `[3 1 4 2 | 5]`

2. **Second Pass:**
   - Compare `3` and `1` → swap → `[1 3 4 2 5]`
   - Compare `3` and `4` → no swap → `[1 3 4 2 5]`
   - Compare `4` and `2` → swap → `[1 3 2 4 5]`
   - Second largest element `4` is now in place.
   - List after second pass: `[1 3 2 | 4 5]`

3. **Third Pass:**
   - Compare `1` and `3` → no swap → `[1 3 2 4 5]`
   - Compare `3` and `2` → swap → `[1 2 3 4 5]`
   - Third largest element `3` is now in place.
   - List after third pass: `[1 2 | 3 4 5]`

4. **Fourth Pass:**
   - Compare `1` and `2` → no swap → `[1 2 3 4 5]`
   - Fourth largest element `2` is now in place.
   - List after fourth pass: `[1 | 2 3 4 5]`

5. **Fifth Pass:**
   - The list is already sorted.
   - Final sorted list: **`[1 2 3 4 5]`**

