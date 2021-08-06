/**
 *
 * @author prashant ghimire
 */
public class BinarySearch {
    
    public static boolean binarySearcher(int[] sortedArray, int searchedItem){
        
        int start_index = 0;
        int end_index = sortedArray.length - 1;
        int mid_index;
        
        while (start_index <= end_index){
            mid_index = (start_index + end_index) / 2;
            
            if (sortedArray[mid_index] < searchedItem){
                start_index = mid_index + 1;
            }
            else if ( sortedArray[mid_index] == searchedItem){
                return true;    //if searched item found
            }
            else {
                end_index = mid_index - 1;
            }
        }
        return false;   //if searched item not found
    }
}

