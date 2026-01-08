public class countEvenOdd {

    public static void main(String[] args){

//      LOGIC (EASIEST WAY)

// 1️ Create two variables:

// int even = 0;
// int odd = 0;


// 2️ Traverse the array:

// If element % 2 == 0 → increment even

// Else → increment odd

// 3️ Print both values

    int[] arr = {1,2,3,4,5,6,7};
    int even = 0;
    int odd =0;

    for(int i=0; i<arr.length; i++){
       if(arr[i] % 2 == 0){
        even++;
       }else{
        odd++;
       }
    }
    System.out.println("Even: " + even + " , Odd: " + odd);

    }
    
}
