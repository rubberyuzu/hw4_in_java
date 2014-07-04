
import java.lang.reflect.Array;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
 
 
public class CollectionRotation<T>{

 
    Collection rotate( Collection<T> col, int num){
 
        T arr[] = (T[]) col.toArray();
 
        T[] copyArr = (T[]) new Object[arr.length];
 
        int numBer;
 
        if(num<0){
            numBer = arr.length + num;
        }else{
            numBer = num;
        }
 
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
 
        for(int i=0; i<(arr.length-numBer); i++){
            arr[i+numBer] = copyArr[i];
        }
 
        for(int j=0; j<numBer; j++){
            arr[j] = copyArr[arr.length-(numBer-j)];
        }
 
        return new ArrayList<T>(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        CollectionRotation<Integer> test = new CollectionRotation<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(test.rotate(list, -1));
        
        
    }

	
}