/**
 *
 * @author prajwal pokhrel
 */
public class AscendingSorter {
    
    public static void sort(int[] a){
        for (int i=0; i<a.length-1; i++){
            int minPos = minPosFinder(a, i);
            swap(a, minPos, i);
        }
    }

    public static int minPosFinder(int[] a, int from){
        int minPos = from;
        
        for (int i = from+1; i<a.length; i++){
            if(a[i]<a[minPos]){
                minPos = i;
            }
        }
        return minPos;
    }
    
    public static void swap(int[] a, int minPos, int from){
        int temp = a[minPos];
        a[minPos] = a[from];
        a[from] = temp;
    }
}

