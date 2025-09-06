import java.util.Arrays;

public class MinGame_2974 {
    public static void main(String[] args) {
        int arr[]={5,4,2,3}; 
        numberGame(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] numberGame(int[] arr) {
        Arrays.sort(arr);  
        
        for(int i=0;i<arr.length;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
}
