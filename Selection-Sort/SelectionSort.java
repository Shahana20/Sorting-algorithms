class Main {
    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

  // Sorting Logic 
  // ---------------------------------------------------
    public static void sort(int[] array, int n) {
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
                swap(array, i, minIndex);
            }
        }
    }
  // ---------------------------------------------------
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2};
        int n = array.length;
        sort(array, n);
        System.out.println("Sorted Array : ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
