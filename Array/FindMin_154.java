public class FindMin_154 {
    public static void main(String[] args) {
        int arr[]={1,3,3};

        int minElement=findMin(arr);

        System.out.println("Minimum Element is:"+minElement);
    }

    public static int findMin(int arr[])
    {
        int low=0;
        int high=arr.length-1;

        while (low<high) 
        {
            int mid=(low+high)/2;

            if(arr[mid]==arr[high] && arr[mid]==arr[low])
            {
                low++;
                high--;
                continue;
            }
            
            if(arr[mid]>arr[high])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return arr[low];
    }
}
