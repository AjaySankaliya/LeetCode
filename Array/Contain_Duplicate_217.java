import java.util.Arrays;

public class Contain_Duplicate_217 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};

        if(containsDuplicate(arr))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
    public static boolean containsDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                return true;
            }
        }
        return false;   
    }
}
