public class Jump_Game_55 {
    public static void main(String[] args) {
        int arr[]={1,1,2,5,2,1,0,0,1,3};
        if(canJump(arr))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
    public static boolean canJump(int[] nums) {
        int finalPosition=nums.length-1;

        for(int i=nums.length-2;i>=0;i--)
        {
            if(i+nums[i]>=finalPosition)
            {
                finalPosition=i;
            }
        }
        return finalPosition==0;
    }
}
