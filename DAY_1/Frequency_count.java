public class Frequency_count {
        public static void main(String[] args) {
            int arr[] = { 2 , 32 , 33, 44 ,5 , 3 , 4 ,5 ,5 ,6, 0 };
            int n = 5 ;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(n == arr[i]){
                    count++;
                }
            }
            System.out.println("The count for the number " + n +  " is " + count);
        }

}