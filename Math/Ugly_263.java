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

    public boolean isUgly(int num) {
        if (num <= 0) return false;

        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }
}
