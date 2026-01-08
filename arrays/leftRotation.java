public class leftRotation {

    public static void main(String[] args) {
      
    // 1️. Store first element in temp
    // 2️. Move all elements 1 position left
    // 3️. Put temp at last index
    

    int[] arr = {1, 2, 3, 4, 5};
    int temp = arr[0];
    for(int i=0; i<arr.length-1; i++){
        arr[i] = arr[i + 1];
    }
     arr[arr.length-1] = temp;
     for(int i=0; i<arr.length; i++){
     System.out.print(arr[i] + " ");
     }

     }   
}
