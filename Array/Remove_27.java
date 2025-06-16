public class Remove_27
{
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6};
        int num=2;

        int newLength = removeElement(arr, num);
        
        System.out.println("Array after removing " + num + ":");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeElement(int[] arr,int val)
    {
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[index]=arr[i];
                index++;
            }
        } 
        return index;
    } 
}