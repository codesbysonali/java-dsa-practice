public class elementFrequency {

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 3, 1};

       for(int i=0; i<arr.length; i++){
        boolean alreadyCount = false;

        for(int k=0; k<i; k++){
            if(arr[i] == arr[k]){
                alreadyCount = true;
                break;
            }
        }
        if( alreadyCount){
            continue;
        }
        int count =0;
        for(int j=0; j<arr.length; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        System.out.println(arr[i] + " = " + count);
       }
    }
    
}
