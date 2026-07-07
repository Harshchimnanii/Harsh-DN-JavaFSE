class FindMinMax{
    static int[] maxOrmin(int a[]){
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if(max<a[i]) {
                max = a[i];
                // min = a[i];
            }
        }

        return new int[] {max , min};
    }
}
public class MinMax {

    public static void main(String[] args) {
        int arr[] = { 2 , 32 , 33, 44 ,5 };
        FindMinMax minmax = new FindMinMax();
        int [] result = minmax.maxOrmin(arr);
        System.out.println(result[0] +" "+ result[1]);
    }
}
