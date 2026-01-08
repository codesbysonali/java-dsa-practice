public class secLargestElement {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int max = arr[0];            // int max = Integer.MIN_VALUE;
        int secMax = arr[0];        // int secdMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
         System.out.println("second largest element: " + secMax);
    }
}
    

