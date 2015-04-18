
/**
 * @author Max
 * @version 2014.04.18
 */
public class BubbleSort {
    private int[] unsortedArray;
    public BubbleSort() {
       ArrayGenerator arrayGenerator = new ArrayGenerator();
       unsortedArray = arrayGenerator.getUnsortedArray();
       System.out.println(arraySort(unsortedArray));
    }
    
    /**
     * returns the time taken to complete the sort
     */
    public String arraySort(int[] array) {
        //has to be long instead of an int because bubble sort's that bad sometimes
        long steps = 0;
        for (int last = array.length-1; last > 0; last--) {
            boolean finished = true;
            for (int i = 0; i < last; i++) {
                steps++;
                if (array[i] > array[i+1]) {
                    int holder = array[i];
                    array[i] = array[i+1];
                    array[i+1] = holder;
                    finished = false;
                }
            }
            if (finished) return "Bubblesort on an unsorted array took " + steps + " steps.";
            steps++;
        }
        return "Bubblesort on an unsorted array took " + steps + " steps.";
    }
}
