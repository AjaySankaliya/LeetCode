class Palindrome_125
{
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";

        if(isPalindrome(str))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
     public static boolean isPalindrome(String str) {
        String rev="";
        str=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","" );
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev+=ch;
        } 
        return str.equals(rev);
    }
}