
/**
 * @author Max
 * @version 2014.04.18
 */
public class QuickSort {
    private int[] unsortedArray;
    public QuickSort() {
       ArrayGenerator arrayGenerator = new ArrayGenerator();
       unsortedArray = arrayGenerator.getUnsortedArray();
       System.out.println(arraySort(unsortedArray, 0, unsortedArray.length-1, 0));
    }
    
    /**
     * returns the time taken to complete the sort
     */
    public String arraySort(int[] array, int startIndex, int endIndex, int steps) {
        int leftIndex = startIndex;
        int rightIndex = endIndex;
        int pivot = array[(leftIndex + rightIndex) / 2];
        while (leftIndex <= rightIndex) {
            steps++;
            //search for an element with a higher value than the pivot, lower than it
            while (array[leftIndex] < pivot) {steps++; leftIndex++;}
            //search for an element with a lower value than the pivot, higher than it
            while (array[rightIndex] > pivot) {steps++; rightIndex--;}
            //check the left index hasn't overtaken the right index
            if (leftIndex <= rightIndex) {
                //swap the elements
                int holder = array[leftIndex];
                array[leftIndex] = array[rightIndex]; 
                array[rightIndex] = holder;
                leftIndex++; rightIndex--;
            }
        }
        if (leftIndex < endIndex) arraySort(array, leftIndex, endIndex, steps); 
        if (rightIndex > startIndex) arraySort(array, startIndex, rightIndex, steps);
        return "Quicksort on an unsorted array took " + steps + " steps.";
    }
}
