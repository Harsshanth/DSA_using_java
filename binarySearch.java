class Main{
    public static void main(String[] args) {
        int[] arr = {-1,1,2,3,4,5,6,7};
        int ans = binarySearch(arr, -1);
        if(ans!=-1){
            ans++;
            System.out.println(arr[ans-1]+" is found at "+ans);
        }
        else{
            System.out.println("Not Found!!");
        }
    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length;

        while(start <= end){
            int mid = start + (end-start) /2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        
        return -1;

    }
}