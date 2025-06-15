package Math;
class Palindrom_9 {
    public static void main(String[] args) {
        int num=121;
        if(isPalindrome(num))
        {
            System.out.println("number is Palindrom");
        }
        else
        {
            System.out.println("number is not Palindrom");
        }
    }
    public static boolean isPalindrome(int num)
    {
        if (num < 0) {
            return false;
        }

        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int mod = temp % 10;
            rev = rev * 10 + mod;
            temp = temp / 10;
        }
       
        return num==rev;
    }
}