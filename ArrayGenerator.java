import java.util.Random;
/**
 * @author Max
 * @version 2015.04.18
 */
public class ArrayGenerator implements Generator {
    private int[] unsortedArray = new int[size];
    private int[] sortedArray = new int[size];
    public ArrayGenerator() {
        int number;
        for(int i = 0; i < size; i++) {
            sortedArray[i] = i;
            number = random.nextInt(size) + 1;
            unsortedArray[i] = number;
        }
    }
    
    public int[] getSortedArray() {return sortedArray;}
    public int[] getUnsortedArray() {return unsortedArray;}
    public int getSearchValue() {return random.nextInt(size-(size/2)) + (size/2);}
}
