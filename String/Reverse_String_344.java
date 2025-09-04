public class Reverse_String_344 {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};

        System.out.println("Before reverse: "+String.valueOf(s));

        reverseString(s);

        System.out.println("After reverse: "+String.valueOf(s));

    }

    public static void reverseString(char[] s)
    {
        int start=0;
        int end=s.length-1;

        while(start<=end)
        {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;

            start++;
            end--;
        }
    }
}
