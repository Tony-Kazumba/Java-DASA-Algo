import java.util.Arrays;

public class MergeSort {

//    public static int[] mergeSort(int[] array){
//
//    }
    public static int[] merge(int[] array1, int[] array2){
        int[] combinedArray = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                combinedArray[index] = array1[i];
                ++index;
                ++i;
            }else{
                combinedArray[index] = array2[j];
                ++index;
                ++j;
            }
        }

        while(i < array1.length){
            combinedArray[index] = array1[i];
            ++index;
            ++i;
        }

        while(j < array2.length){
            combinedArray[index] = array1[j];
            ++index;
            ++j;
        }

        return combinedArray;
    }

    public static int[] mergeSort(int[] array){

//        if(array.length == 1){
//            return array;
//        }
//        int midIndex = array.length/2;
//        int[] left = new int[midIndex];
//        for(int i = 0; i < midIndex; ++i){
//            left[i] = array[i];
//        }
//
//        int[] right = new int[array.length - midIndex];
//        for(int i = midIndex; i <array.length; ++i){
//            right[i-midIndex] = array[i];
//        }
//        left = mergeSort(left);
//        right = mergeSort(right);
//        return merge(left,right);
        if(array.length == 1){
            return array;
        }
        int midIndex = array.length/2;
        int[] left = new int[midIndex];
        for(int i = 0; i < midIndex; ++i){
            left[i] = array[i];
        }

        int[] right = new int[array.length - midIndex];
        for(int i = midIndex; i <array.length; ++i){
            right[i-midIndex] = array[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left,right);
    }

    public static void main(String[] arg){
        int[] myArray = {4,6,1,7,3,2,5};
        int[] result = mergeSort(myArray);
        Arrays.toString(result);
        System.out.println(result);
//        int[] a = {7,3,10};
//        int[] b = {1,4,9};
//        int[] c = merge(a,b);
//        System.out.println(Arrays.toString(c));
    }
}
