import java.util.*;
/**
 * @author Max
 * @version 2015.04.18
 */
public class LinkedListGenerator implements Generator {
    private LinkedList<Integer> unsortedList = new LinkedList<Integer>();
    public LinkedListGenerator() {
        int number;
        for(int i = 0; i < size; i++) {
            number = random.nextInt(size) + 1;
            unsortedList.add(number);
        }
    }
    
    public LinkedList<Integer> getUnsortedList() {return unsortedList;}
}