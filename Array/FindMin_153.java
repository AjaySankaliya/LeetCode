public class FindMin_153 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};

        int minElement=findMin(arr);

        System.out.println("Min Element in Array is: "+minElement);
    }

    public static int findMin(int arr[])
    {
        // int min=arr[0];
     
        // for(int i=1;i<arr.length;i++)
        // {
        //     if(arr[i]<min)
        //     {
        //         min=arr[i];
        //     }
        // }
        // return min;

        int low=0;
        int high=arr.length-1;

        while(high!=low)
        {
            int mid=(high+low)/2;

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
