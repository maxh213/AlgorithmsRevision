
/**
 * @author Max
 * @version 2014.04.18
 */
public class BinaryChopSearch {
    private int[] sortedArray;
    public BinaryChopSearch() {
       ArrayGenerator arrayGenerator = new ArrayGenerator();
       sortedArray = arrayGenerator.getSortedArray();
       int randomSearchValue = arrayGenerator.getSearchValue();
       System.out.println(arraySearch(sortedArray, randomSearchValue));
       System.out.println(arraySearch(sortedArray, -500));
    }
    
    /**
     * returns the time taken to complete the search
     */
    public String arraySearch(int[] array, int searchItem) {
        int lowIndex = 0, highIndex = array.length - 1, index, steps = 0;
        index = (int)((lowIndex + highIndex)/2);
        while (array[index] != searchItem) {
            steps++;
            if (array[index] < searchItem) {
                lowIndex = index;
                index = (int)((lowIndex + highIndex)/2);
            } else if (array[index] > searchItem) {
                highIndex = index;
                index = (int)((lowIndex + highIndex)/2);
            }
            if (highIndex == lowIndex) return "Binary Chop search on a sorted array took " + steps + " steps. Item not found.";
        }
        return "Binary Chop search on a sorted array took " + steps + " steps. Item found.";
    }
}
