import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Object[] numberArr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arrayToArrayList(numberArr));
        numberArr = chengPosition(numberArr, 1, 5);
        System.out.println(arrayToArrayList(numberArr));
    }

    public static Object[] chengPosition(Object[] arr, int pos1, int pos2){
        Object obj = arr[pos1];
        Object[] newArr = arr;
        newArr[pos1] = arr[pos2];
        newArr[pos2] = obj;
        return newArr;
    }

    public static List<Object> arrayToArrayList(Object[] arr){
        return Arrays.stream(arr).toList();
    }
}
