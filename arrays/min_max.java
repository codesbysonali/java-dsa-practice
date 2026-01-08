

public class min_max {
    
    public static void main(String[] args) {

        int[] arr = {23,12,34,5,21};

        int min =arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max= arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
    }
}

