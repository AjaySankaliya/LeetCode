public class Container_Water_11 {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int result=maxArea(arr);
        System.out.println(result);
    }

    public static int maxArea(int[] height)
    {
        int lb=0;
        int hb=height.length-1;
        int area=0;

        while(lb<hb)
        {
            int width=hb-lb;
            int h=Math.min(height[lb], height[hb]);
            int MaxA=width*h;
            area=Math.max(area,MaxA);

            if(height[lb]<height[hb])
            {
                lb++;
            }
            else
            {
                hb--;
            }
        }

        return area;
    }

    // public static int maxArea(int[] height)
    // {
    //     int area=0;
    //     for(int i=0;i<height.length;i++)
    //     {
    //         for(int j=i+1;j<height.length;j++)
    //         {
    //             int width=j-i;
    //             int h=Math.min(height[i], height[j]);
    //             int maxA=width*h;
    //             if(maxA>area)
    //             {
    //                 area=maxA;
    //             }
    //         }
    //     }
    //     return area;
    // }
}
