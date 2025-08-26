public class SearchInsert_35 {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};

        int num=5;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<num && arr[i]!=num)
            {
                System.out.println(i);
            }
        }
    }
}
