package arrays.searching;
public class LinearSearch {
    public static void main(String[] args) {
         int[] arr = {1 ,4 ,2 ,5 ,6};
        System.out.println(linearSearch(arr, 7 ));
    }

    public static int linearSearch(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
