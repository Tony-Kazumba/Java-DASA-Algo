import java.util.Arrays;

public class QuickSort {
    public static int pivot(int[] array, int pivotIndex, int endIndex){
        int swap = pivotIndex;

        for(int i = pivotIndex + 1; i <= endIndex; i++ ){
            if(array[i] < array[pivotIndex]){
                ++swap;
                swap(array,i,swap);
            }
        }
        swap(array,pivotIndex,swap);
        return swap;
    }
    public static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

    }

    public static void quickSort(int[] array, int left, int right){
       if(left < right){
           int pivotIndex = pivot(array,left,right);
           quickSort(array,left,pivotIndex-1);
           quickSort(array,pivotIndex+1,right);
       }

    }

    public static void main(String[] arg){
        int[] myArray = {4,6,1,7,3,2,5};
        int left = 0;
        int right = myArray.length-1;
        quickSort(myArray,left,right);
        System.out.println(Arrays.toString(myArray));
//        int returnedIndex = pivot(myArray,0,6);
//        System.out.println("Returned Index: " + returnedIndex);
//        System.out.println(Arrays.toString(myArray));myArray
    }
}
