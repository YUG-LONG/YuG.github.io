package 算法;
public class DualPivotQuickSort {

   public static void dualPivotQuickSort(int[] arr, int low, int high) {
      if (low < high) {
         int[] pivots = partition(arr, low, high);
         dualPivotQuickSort(arr, low, pivots[0] - 1);
         dualPivotQuickSort(arr, pivots[0] + 1, pivots[1] - 1);
         dualPivotQuickSort(arr, pivots[1] + 1, high);
      }
   }

   private static int[] partition(int[] arr, int low, int high) {
      if (arr[low] > arr[high]) {
         swap(arr, low, high);
      }

      int pivot1 = arr[low];
      int pivot2 = arr[high];

      int i = low + 1;
      int k = low + 1;
      int j = high - 1;

      while (k <= j) {
         if (arr[k] < pivot1) {
            swap(arr, i, k);
            i++;
         } else if (arr[k] >= pivot2) {
            while (arr[j] > pivot2 && k < j) {
               j--;
            }
            swap(arr, j, k);
            j--;
            if (arr[k] < pivot1) {
               swap(arr, i, k);
               i++;
            }
         }
         k++;
      }

      i--;
      j++;

      swap(arr, low, i);
      swap(arr, high, j);

      return new int[]{ i, j };
   }

   private static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

   public static void main(String[] args) {
      int[] arr = {8, 3, 1, 5, 10, 6, 2, 7, 9, 4};
      dualPivotQuickSort(arr, 0, arr.length - 1);
      for (int num : arr) {
         System.out.print(num + " ");
      }
   }
}
