public class removeDuplicate {

    public static void main(String[] args){


//         Logic (Step by Step)

// 1️⃣ Traverse each element (i)
// 2️⃣ Check if this element has already appeared (same as frequency logic)
// 3️⃣ If not appeared → print it / keep it
// 4️⃣ If appeared → skip

// Notice: We don’t need to count, just avoid duplicates.
 
        int[] arr = {1,2,2,3,1};

        for(int i=0; i<arr.length; i++){
            boolean alreadyAppeared = false;

            for(int k=0; k<i; k++){
                if(arr[i] == arr[k]){
                    alreadyAppeared = true;
                    break;
                }
            }
            if(alreadyAppeared) continue;

            System.out.print(arr[i] + " ");
        }

    }
}
