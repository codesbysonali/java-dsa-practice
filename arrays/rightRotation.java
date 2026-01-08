public class rightRotation {

    public static void main(String[] args) {

        
//  Logic:
// 1️. Store last element in temp
// 2️. Move all elements 1 position right
// 3️. Put temp at first index

    int[] arr = {1,2,3,4,5};
    int temp = arr[arr.length-1];

    for(int i=arr.length-1; i>0; i--){
        arr[i] = arr[i-1];
    }
    arr[0] = temp;

    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
        
    }
    
}
