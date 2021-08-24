

public class bubbleSort {

    static public void bubbleSortFunc(int[] arr){
        int temp;
        
        for(int i=0 ;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                   temp= arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   
                }
                
            }
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        bubbleSortFunc(arr);
    }
    
}
