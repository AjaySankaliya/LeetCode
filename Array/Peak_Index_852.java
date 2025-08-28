public class Peak_Index_852 {
    public static void main(String[] args) {
        int arr[]={0,10,5,2};

        int index=peakIndexInMountainArray(arr);

        System.out.println(index);
    }

    public static int peakIndexInMountainArray(int[] arr)
    {
        int low=0;
        int high=arr.length-1;

        int mid;
        while(low<high)
        {
            mid=(high+low)/2;

            if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return low;
    }
}
