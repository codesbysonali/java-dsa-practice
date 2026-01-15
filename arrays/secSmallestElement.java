public class secSmallestElement {

    public static void main(String[] args) {
      
        int[] arr = {2,5,6,3,1};

        int min = arr[0];          // int min = Integer.MAX_VALUE;
        int secMin = arr[0];       // int secMin = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                secMin = min;
                min = arr[i];
            }else if (arr[i]<secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        System.out.println("second smallest value of array is: " + secMin);

    }
    
}
