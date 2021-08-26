import java.util.Arrays;

public class selectionSort {

    static void sort(int[] arr){
        int last;
        int max ;

        for(int i=0;i<arr.length;i++){
            last = arr.length-i-1;
            max = maxIndex(arr, 0, last);
            System.out.println("max: "+max);
            swapped(arr,max,last);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
       
    }
    static void swapped(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxIndex(int[] arr,int first ,int last){
        int max = first;
        for (int i=first;i<=last;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
