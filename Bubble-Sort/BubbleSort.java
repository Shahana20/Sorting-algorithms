class Main {
  
  // Sorting logic
    public static void sort(int[] array, int n) {
        for(int i = n - 1; i > 0; i--) {
            for(int j = i - 1; j >= 0; j--) {
                if(array[i] < array[j]) swap(array, i, j);
            }
        }
    }

  // Helper method
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

  // Main method
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 1, 2};
        int n = array.length;
        
        sort(array, n);
        System.out.println("Sorted array :");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
