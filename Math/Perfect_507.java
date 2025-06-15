public class Perfect_507 {
    public static void main(String[] args) {
        int num=28;
        if(checkPerfectNumber(num))
        {
            System.out.println("number is perfect number");
        }
        else
        {
            System.out.println("number is not perfect number");
        }
    }

    public static boolean checkPerfectNumber(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return num==sum;
    }

}
