class FindFirst_Last_34
{   
    public static void main(String[] args) {
        int arr[]={5,7,7,8,10,4,8};
        int result[]=searchRange(arr, 8);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] searchRange(int[] arr, int target) {
        
        if(arr.length==0)
        {
            return new int[] {-1,-1};
        }

        int low=0;
        int high=arr.length-1;
        int result[]=new int[2];

        while(low<high)
        {
            int mid=(low+high)/2;

            if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }

        if(arr[low]!=target)
        {
            return new int[] {-1,-1};
        }

        result[0]=low;

        high=arr.length;

        while(low<high)
        {
            int mid=(low+high)/2;

            if(arr[mid]<=target)
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        result[1]=low-1;

        return result;
        
    }
}