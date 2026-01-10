public class printReverseNum{

    public static void printRevNumb(int n){

        if(n == 0){
            return;
        }
        System.out.println(n);
        printRevNumb(n-1);
    }
    public static void main(String[] args){

        int num = 5;

        printRevNumb(num);

    }
}