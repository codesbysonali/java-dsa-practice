public class practice {

    public static void main(String[] args) {

        // int[] arr = {12,4,34,2,3,7};
        // int max = arr[0];
        // int min = arr[0];
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        //     else if(arr[i]<=min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println("maximum: " + max);
        // System.out.println("minimum: " + min);
        


    //     int[] arr = {2,3,4,12,56,7,9};
    //     int countEven =0, countOdd=0;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] % 2 == 0){
    //             countEven++;
    //         }else{
    //             countOdd++;
    //         }
    //     }
    //     System.out.println("Even: " + countEven);
    //     System.out.println("Odd: " + countOdd);



    // int[] arr={10,20,30,40};
    // for(int i =arr.length-1; i>=0; i-- ){
    //     System.out.print(arr[i]+ " ");
    // }



    // int[] arr={10,20,30,40};
    // boolean isSorted = true;
    // for(int i=0; i<arr.length-1; i++){
    //     if(arr[i]>arr[i +1] ){
    //         isSorted = false;
    //         break;
    //     }
    // }
    // if(isSorted){
    //     System.out.println("Array is sorted");
    // }else{
    //     System.out.println("Array is not sorted");
    // }



    int[] arr = {1, 5, 20, 8,45,25};
    int max = arr[0];
    int secMax = arr[0];

    for(int i=0; i<arr.length; i++){
        if(arr[i] >max){
              secMax = max;
            max=arr[i];
          
        }else if(arr[i]<max && arr[i] >= secMax){
              secMax = arr[i];
        }
        }
        System.out.println("Second largest element is: " + secMax);
    }
      }  

