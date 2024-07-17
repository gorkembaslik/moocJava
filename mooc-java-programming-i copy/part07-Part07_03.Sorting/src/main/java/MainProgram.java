import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int smallest=99;
        for (int val: array){
            if (val<smallest){
                smallest = val;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest=99, index_smallest=0, index=0;
        for (int val: array){
            if (val<smallest){
                smallest = val;
                index_smallest = index;
            }
            index++;
        }
        
        return index_smallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = 99, s_i=startIndex;
        
        while (startIndex<table.length){
            if (table[startIndex]<smallest){
                smallest = table[startIndex];
                s_i = startIndex;
            }
            startIndex++;
        }
        return s_i;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        int i=0;
        System.out.println(Arrays.toString(array));
        while(i<array.length){
            MainProgram.swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
            i++;
        }
    }
}
