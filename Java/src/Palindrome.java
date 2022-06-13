import java.io.IOException;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        checkPalindrome();
    }

    private static void checkPalindrome() {
        int sum = 0;
        int num = 2332;
        int temp;

        temp = num;
        while (temp!=0){
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp/10;
        }
        if (num == sum){
            System.out.println("This is palindrome");
        }else {
            System.out.println("This is not palindrome");
        }
    }

}
