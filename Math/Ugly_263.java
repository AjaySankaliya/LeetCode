package Math;

public class Ugly_263 {
    public static void main(String[] args) {
        int num=7;
        if(checkUglyNumber(num))
        {
            System.out.println("number is Ugly number");
        }
        else
        {
            System.out.println("number is not Ugly number");
        }
    }

    public static boolean checkUglyNumber(int num)
    {
        int mul=1;
        for(int i=1;i<num;i++)
        {
            if(i==2 || i==3 || i==5)
            {
                if(num%i==0)
                {
                    mul*=i;
                }
            }
        }
        return num==mul;
    }
}
