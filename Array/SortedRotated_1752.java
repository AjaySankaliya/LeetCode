class SortedRotated_1752
{
    public static void main(String[] args) {
        SortedRotated_1752 obj = new SortedRotated_1752();

        int[] arr1 = {3, 4, 5, 1, 2};  
        int[] arr2 = {2, 1, 3, 4};     
        int[] arr3 = {1, 2, 3};        

        System.out.println("Is arr1 sorted and rotated? " + obj.check(arr1));
        System.out.println("Is arr2 sorted and rotated? " + obj.check(arr2));
        System.out.println("Is arr3 sorted and rotated? " + obj.check(arr3));
    }
    public boolean check(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[0]<arr[arr.length-1]){
            count++;
        }
        if(count>=2){
            return false;
        }else
        {
            return true;
        }
    }
}