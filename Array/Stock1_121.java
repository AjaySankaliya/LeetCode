public class Stock1_121 {
    public static void main(String args[])
    {
        int arr[]={7,1,5,3,6,4};
        
        int profit=maxProfit(arr);

        System.out.println("Maximum Profit is: "+profit);

    } 

    public static int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice>profit)
            {
                profit=prices[i]-minPrice;
            }
        }
        return profit;
    }   
}
