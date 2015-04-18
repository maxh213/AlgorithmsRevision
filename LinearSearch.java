
/**
 * @author Max
 * @version 2014.04.18
 */
public class LinearSearch {
    private int[] unsortedArray;
    private int[] sortedArray;
    private int randomSearchValue;
    public LinearSearch() {
       ArrayGenerator arrayGenerator = new ArrayGenerator();
       unsortedArray = arrayGenerator.getUnsortedArray();
       sortedArray = arrayGenerator.getSortedArray();
       randomSearchValue = arrayGenerator.getSearchValue();
       System.out.println(arraySearch(unsortedArray, randomSearchValue, "an unsorted"));
       System.out.println(arraySearch(sortedArray, randomSearchValue, "a sorted"));
    }
    
    /**
     * returns the time taken to complete the search 
     */
    public String arraySearch(int[] array, int searchItem, String arrayType) {
        int steps = 0;
        for (int i = 0; i < array.length; i++) {
            steps++;
            if (array[i] == searchItem) {
                return "Linear search on "+ arrayType +" array took "+ steps +" steps. Item found.";
            } 
        }
        return "Linear search on "+ arrayType +" array took "+ steps +" steps. Item not found.";
    }
}
